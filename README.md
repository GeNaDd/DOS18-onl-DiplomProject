# DOS18-onl-DiplomProject
# Дипломный проект
 Школа: TechMeSkills\
 Студент: Давыдчик Геннадий Вячеславович\
 Направление: DevOps инжнер\
 Группа: Dos18-Onl

## Требования к дипломному проекту
* В дипломном проекте должно быть реализовано:
* выбран общедоступный репозиторий или несколько репозиториев с исходным кодом приложения, состоящего из одного или нескольких микросервисов;
### В нашем случае был выбрано приложение которое будет развернуто на ApacheServer
* Выполнен fork или сделана копия репозитория;
* атоматизировано создание инфраструктуры для развертывания проекта;
* автоматизированы процессы CI/CD;
настроен мониторинг инфраструктуры и приложения.

## Критерии выполнения
* Репозитории должен содержать минимальную документацию, описывающую содержимое и процессы сборки и развертывания;
* Инфраструктура должна разворачиваться с нуля запуском одной команды. Все должно быть реализовано по принципам IaC;
CI/CD:
* при коммите в любую ветку репозитория должны запускаться этапы проверки кода линтером, сборки исходного кода, автотесты * собранного приложения и загрузка артефактов в хранилище;
* при коммите в основную ветку (master/main) дополнительно должен запускаться автоматический deployment на целевую инфраструктуру;
Должно отправляться уведомление о результате сборки и развертывания в любой канал (почта, чат).
### В нашем случае. Уведомление отправляются на Телеграм бот настроенного с помощью FatherBot.

## Дополнительные (опциональные) варианты улучшения проекта:
* Реализация SSL/TLS;
* Масштабируемость (несколько реплик одного сервиса с балансировщиком);
* Контейнеризация;
* Kubernetes в качестве целевой инфраструктуры;
* Больше типов и количества тестов (интеграционное, нагрузочное и пр.);
* Автоматическая настройка всего (включая CI\CD, мониторинг) с нуля;
* Мониторинг инфраструктуры и приложения;
* Реализация Log-aggregation;
* Документированный код.

## Применяемые инструменты:
* Развертывание инфраструктуры: Terraform, AWS, EKS, Ansible, Docker, Vagrant;
* CI/CD: Jenkins, Github Actions;
* Оповещение: Email, Telegram, Slack, Discord;
* Мониторинг: Prometheus, Grafana;
* Логирование: ELK.

## Защита проекта:
* Краткая презентация с описанием проекта, примененными инструментами, проделанной работы\
и полученными результатами (3-5 мин.);
* Демонстрация CI/CD (10-12 мин.);
* Вопросы и обсуждение (5-7 мин.).

## Примеры репозиториев приложений:
* Golang Hello World
https://github.com/hackersandslackers/golang-helloworld
* Sample app maven
https://github.com/jenkins-docs/simple-java-maven-app
* Sample app gradle
https://github.com/jitpack/gradle-simple
https://github.com/jhipster/jhipster-sample-app-gradle
* Calculator App
https://github.com/HouariZegai/Calculator

## Инструменты использумые в Дипломном Проекте
* OS Ubuntu 22.04 lts
* GitHub
* GitHub Actions
* Terraform
* Docker
* Docker HUB
* Docker Compose
* Docker Image
* Google Cloud Platform
* Google Kubernetis Engine
* Cert Manager для Kubernetes

## Общая топология проекта

![Схема диплома](https://github.com/GeNaDd/DOS18-onl-DiplomProject/assets/44873704/09d880ba-f04f-43be-90de-0d6bb9f693c2)

## Общее описание проекта
### Общее структура проекта выглядит следующим образом:
.\
├── Docker\
│   ├── docker-compose.yml\
│   ├── Dockerfile\
│   └── webb\
│       ├── css\
│       │   └── style.css\
│       ├── images\
│       │   └── devopsimg.png\
│       └── index.html\
├── k8s\
│   ├── deployment.yaml\
│   ├── ingress.yaml\
│   └── svc.yaml\
├── README.md\
├── iac-terraform\
│   ├── 0-variables.tf\
│   ├── 1-provider.tf\
│   ├── 2-vpc.tf\
│   ├── 3-subnets.tf\
│   ├── 4-router.tf\
│   ├── 5-nat.tf\
│   ├── 6-firewalls.tf\
│   ├── 7-kubernetes.tf\
│   └── 8-node-pools.tf\
└── VERSION\
\
6 directories, 19 files

### В Дипломном проекте были применены следующие ключи:
* DOCKERGENDEVBYLOGON – имя учетной записи в Docker Hub
* DOCKERGENDEVBYTOKEN – токен доступа сгенерированный в Docker Hub
* GOOGLE_APPLICATION_CREDENTIALS – данные JSON-файла сервисного аккаунта Google Cloud Platform
* GOOGLE_CREDENTIALS – данные JSON-файла сервисного аккаунта Google Cloud Platform
* GOOGLE_PROJECT – ID проекта Google Cloud Platform
* TELEGRAM_CHAT_ID – ID группы Telegram
* TELEGRAM_TOKEN_DIPLOMDOS18ONL – токен созданный BotFather
  
### В проекте должны быть включены следующие API провайдера:
* Kubernetes Engine API
* Compute Engine API
* Cloud Build API
* Cloud Resource Manager API
  
### В проекте Google Cloud Platform создан service account с предварительно сгенерированным JSON–ключом и обладающим следующими привелегиями:
* Compute Storage Admin
* Kubernetes Engine Cluster Admin
* Kubernetes Engine Developer
* Storage Admin
* Storage Folder Admin
* Storage Object Admin

### В проекте необходимо предварительно создать bucket для хранения файла состояния terraform
  
### Созданный репозиторий в Docker Hub
![dockerhub](https://github.com/HenadzDavydchyk/DOS18-onl-DiplomProject/assets/44873704/027ebd4b-16b2-41e9-a011-91610118bc93)

### Создание посредством BotFather бота для оповещений telegram
![notificationtg](https://github.com/HenadzDavydchyk/DOS18-onl-DiplomProject/assets/44873704/6c063aff-f33d-43b6-86bd-ed5e784ea1c4)

### Общее описание выполнения Pipline Git Actions
* Первым этапом, разработчики обновляют репозиторий с соответствующими изменениями в ветке.
* Git Actions вытягивает код из веток текущего репозитория.
#### Описание Jobs Pipline
* Pipline разбит на несколько процессов и выполняются мануально: такие как проверка наличия версионности образа системы, развертывание инфраструктуры с помощью Terraform, развертывание кластера GKE, а также его обновление.
* В Pipline описаны проверки этапов выполнения линтеров, а также тесты, установка соответствующих плагинов необходимых для работы каждых процессов.
* 1-Deployment_Docker_Hub.yaml: где проводится сборка Docker Compose и Docker Image, а также в случае обновления образа, проводится проверка валидности на версионность. Если в случае необходимости обновления образа докер контейнера, необходимо изменить VERSION файла на актуальную версию. Если VERSION файла не изменялся, значит Pipline пропускает этап отправки на Docker Hub для обновления образа.
* Далее проводится интеграционный тест проверки доступности веб-страницы index.html.
* Затем после проверки интеграционных тестов. Останавливается Docker Compose и удаляется образ контейнера.
* После проведения интеграционных тестов проходит обновление Docker Image в Docker HUB. С помощью линтера проходит этап авторизаций на удаленный Docker HUB и получает metadata Docker Image последнего образа.
* После выполнения авторизаций, выполняется сборка Docker Image и отправляет на удаленный Docker HUB.
* 2-Deployment_GKE_Test_Connect_Manual.yaml: выполняет проверку подключения к сервисному аккаунту Google.
* 3-Deployment_Terraform_Apply_Manual.yaml: Pipline выполняет этап развертывания инфраструктуры с помощью Terraform.
* 4-Deployment_GKE_Apply_Manual.yaml: после успешного выполнения развертывания инфраструктуры, далее необходимо выполнить развертывание кластера Kubernetes Engine.
* 5-Deployment_GKE_Update_Manual.yaml: в случае обновления Docker Image, мануально можно выполнить обновление кластера Kubernetes Engine.
* В случае успешного выполнения линтеров, которые происходят в репозиторий Git HUB отправляются в виде уведомления на Телеграм Бот.
### Результатом работы являются следующее
* Успешный выполненный Pipline Git Actions
* Тестовое подключение GKE
 ![gketest](https://github.com/HenadzDavydchyk/DOS18-onl-DiplomProject/assets/44873704/81cacdb9-880d-4fc3-8dfe-9a2a5f2b8142)
* Созданный Докер Контейнер
 ![piplinedocker](https://github.com/HenadzDavydchyk/DOS18-onl-DiplomProject/assets/44873704/7463bfc2-6812-48b8-b70c-5da2aa05d7e3)
* Terraform
![piplineterraform](https://github.com/HenadzDavydchyk/DOS18-onl-DiplomProject/assets/44873704/e025747a-d582-4b72-be3f-f529c3c1eeb4)
* Кластер Kubernetes Engine
![deploymentgke](https://github.com/HenadzDavydchyk/DOS18-onl-DiplomProject/assets/44873704/34606ab8-5df7-4727-a6f8-0594e5f1ff8d)
* Полученное уведомление в Telegram Bot настроенного с помощью Father Bot
![image](https://github.com/GeNaDd/PushingDockerHub/assets/44873704/5e3542b7-38e1-4904-9dba-68b2f873585c)
* Развернутый кластер в Google Kubernetes Engine (GKE)
![image](https://github.com/GeNaDd/PushingDockerHub/assets/44873704/f5e2d42b-97c8-4bd6-90d8-85b0637f2681)
* Успешный вывод страницы index.html
![image](https://github.com/GeNaDd/PushingDockerHub/assets/44873704/b65f23d1-58ad-4c0b-aacc-dd184fc4bd0e)
