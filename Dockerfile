FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/spring-6-webapp.jar spring-6-webapp.jar
ENTRYPOINT ["java","-jar","/spring-6-webapp.jar"]