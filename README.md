# spring-boot-webservice [![Build Status](https://travis-ci.org/koda93/spring-boot-webservice.svg?branch=master)](https://travis-ci.org/koda93/spring-boot-webservice)

## 프로젝트 목적
- 웹 서비스 개발부터 서비스 환경 구축 과정에 대한 이해
- 외부 서버에 개발 및 운영환경 구축
- CI 환경 구축 후 자동 배포하기


## 프로젝트 목표
- Java & Spring & JPA를 이용한 웹서비스 개발
- AWS EC2 & RDS를 이용한 운영 환경 구축
- 배포 스크립트를 이용한 수동 배포 경험
- TravisCI & AWS CodeDeploy & AWS S3로 Test-Build-Deploy 자동화 환경 구축


## Build Flow
1. STS(개발 후 push)  
2. GitHub(버전 관리 / CI 실행)  
3. TravisCI (Test, Build, Notify - Slack, Mail)  
4. (Build 결과 전달) AWS S3
5. AWS CodeDeploy (EC2에 배포)  
6. Amazon EC2
7. SpringBoot App 실행 (사용자는 EC2의 App에 접속)

## Tools
- STS
- Spring Boot 1.5.9
- Java 8
- JPA
- Gradle
- MariaDB
- Handlebars
- BootStrap
- JQuery
- AWS
- Travis


## Reference
- [스프링부트로 웹 서비스 출시하기 - by jojoldu](https://jojoldu.tistory.com/250?category=635883)
