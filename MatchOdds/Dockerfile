FROM maven:3.8-openjdk-17-slim AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-oracle

WORKDIR /app

COPY --from=build /app/target/*.jar /app/testapp.jar

EXPOSE 8089

ENTRYPOINT ["java", "-jar", "/app/testapp.jar"]
