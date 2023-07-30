# Usar uma imagem OpenJDK como base
FROM openjdk:17-jdk-oracle

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o arquivo JAR empacotado do diretório target do projeto Spring Boot
COPY target/Api-0.0.1-SNAPSHOT.jar ./app.jar

# Definir o comando para executar o aplicativo Spring Boot quando o contêiner for iniciado
CMD ["java", "-jar", "app.jar"]