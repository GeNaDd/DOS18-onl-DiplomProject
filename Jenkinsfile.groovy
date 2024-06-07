pipeline {
  agent any
  environment {
        NAME_PROJECT = 'ApacheServerDockerUbuntu'
        DOCKERHUB_CREDENTIALS = credentials('dockerhubjenkins')
        NAME_IMAGE_DEV = 'gendevbydocker/apacheserverubuntu:latest '
        NAME_CONTAINER_DEV = 'apacheservermysql'
        TAG_IMAGE_PROD = 'TEST'
    }
  stages {
    stage('docker-compose Build TEST') {
      steps {
        echo '===== docker-compose Build TEST ====='
        sh 'docker-compose build'
      }
    }
    stage('Checkout'){
      steps {
          checkout scm // получаем код из репозитория
        }
    }
    stage('Build Docker Image') {
        steps {
          dir('webapp'){ //переход в директорию где лежит Dockerfile для сборки имеджа
            echo "===== Docker Build Image ====="
            sh 'ls'
            sh 'docker build -t ${NAME_IMAGE_DEV} .'
          }
        }
    }
    stage('Login DockerHUB'){
      steps {
        echo "===== Login to DockerHUB ====="
        sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
      }
    }
    stage('Docker Push Image DockerHUB'){
      steps {
        echo "===== Docker Pushing Image DockerHUB ====="
        sh 'docker push ${NAME_IMAGE_DEV}'
        cleanWs()
                dir("${env.WORKSPACE}@tmp") {
                     deleteDir()
                }
      }
    }
    stage('Push into gendevby k8s'){
      steps{
        script {
          withCredentials([file(credentialsId: 'gcloud-creds-gendevby', variable: 'GOOGLE_APPLICATION_CREDENTIALS')]){
            sh """
                  echo "===== Auth kubernetes cluster ====="
                  gcloud auth activate-service-account --key-file="$GOOGLE_APPLICATION_CREDENTIALS"
                  gcloud container clusters get-credentials diplom-tmsdos18-cluster \
                    --region=europe-west1-b --project=gendevby
                  #gcloud container clusters resize diplom-tmsdos18-cluster --zone europe-west1-b --num-nodes=0 Остановка кластера
                  #gcloud container clusters resize diplom-tmsdos18-cluster --zone europe-west1-b --num-nodes=1 Поднятие кластера
                  kubectl get namespaces
            """
            dir('k8s'){
              echo "===== Apply kubectl project ====="
              //sh 'kubectl apply -f k8s/svc.yaml -f k8s/ingress.yaml -f k8s/deployment.yaml'
            }
          }
        }  
      }
    }
    //stage('Docker Image Deploy'){//Останавливаем старый образ ДокерКонтейнера, обновляем и запускаем новый
     // steps {
        //dir('ApacheServerDocker'){
       //   echo '===== Docker STOP UP ====='
       //   sh 'docker stop apacheserverubuntu'
       //   sh 'docker rm apacheserverubuntu'
       //   sh 'docker run -d --name apacheserverubuntu -p 80:80 $NAME_IMAGE_DEV'
        //}
     // }
    //}
  }
}
