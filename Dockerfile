FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/spring-6-webapp-0.0.1-SNAPSHOT.jar spring-6-webapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-6-webapp-0.0.1-SNAPSHOT.jar"]