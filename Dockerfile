FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY ${JAR_FILE} app.war

MAINTAINER "mahabira04@gmail.com"
