# Школа TeachMeSkills
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
* Jenkins-опционально
* Docker
* Docker HUB
* Docker Compose
* Docker Image
* Google Cloud Platform
* Google Kubernetis Engine

## Общая топология проекта

![Схема диплома](https://github.com/GeNaDd/DOS18-onl-DiplomProject/assets/44873704/09d880ba-f04f-43be-90de-0d6bb9f693c2)

## Общее описание проекта
### Общее структура проекта выглядит следующим образом:
.\
├── Docker\
│   ├── docker-compose.yml\
│   ├── Dockerfile\
│   └── webb\
│       └── index.html\
├── docker-compose.yml\
├── Jenkinsfile.groovy\
├── k8s\
│   ├── deployment.yaml\
│   ├── ingress.yaml\
│   └── svc.yaml\
├── README.md\
└── webapp\
    ├── Dockerfile\
    └── index.html\
\
4 directories, 11 files

### В Дипломном проекте были применены следующие ключи:
* DOCKERGENDEVBYLOGON – имя учетной записи в Docker Hub
* DOCKERGENDEVBYTOKEN – токен доступа сгенерированный в Docker Hub
* GOOGLE_APPLICATION_CREDENTIALS – данне JSON-файла сервисного аккаунта Google Cloud Platform
* GOOGLE_CREDENTIALS – данне JSON-файла сервисного аккаунта Google Cloud Platform
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
  
### Созданный репозиторий в Docker Hub
![image](https://github.com/GeNaDd/PushingDockerHub/assets/44873704/373337cb-5d98-4792-a8f7-b4cfd33c9d88)

### Создание посредством BotFather бота для оповещений telegram
![image](https://github.com/GeNaDd/PushingDockerHub/assets/44873704/5e3542b7-38e1-4904-9dba-68b2f873585c)

