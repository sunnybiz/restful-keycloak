FROM maven:3.9-eclipse-temurin-21-alpine AS builder

WORKDIR /app
COPY . /app

RUN mvn package

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
COPY --from=builder /app/target/*.jar /app/java-application.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/java-application.jar"]

