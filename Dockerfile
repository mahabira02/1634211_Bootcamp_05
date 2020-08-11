FROM openjdk:8-jdk-alpine

EXPOSE 8082

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} myapps.jar

RUN echo "Creating docker images Lets see"

MAINTAINER "mahabira04@gmail.com"

ENTRYPOINT ["java", "-jar", "myapps.jar"]
