FROM openjdk:8-jdk-alpine

EXPOSE 9999

ADD target/spring_boot_rest-0.0.1-SNAPSHOT.jar newApp.jar