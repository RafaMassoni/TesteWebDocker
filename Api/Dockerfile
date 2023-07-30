FROM maven:3-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests


# Usar uma imagem OpenJDK como base
FROM openjdk:17-jdk-oracle

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

COPY --from=build /home/app/target/Api-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080

# Definir o comando para executar o aplicativo Spring Boot quando o contêiner for iniciado
CMD ["java", "-jar", "/app/app.jar"]