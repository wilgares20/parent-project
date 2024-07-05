# Usar una imagen base de OpenJDK para ejecutar la aplicación
FROM openjdk:11-jre-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR preconstruido al contenedor
COPY target/config-server-1.0.0.jar /app/config-server.jar

# Exponer el puerto en el que la aplicación escuchará
EXPOSE 8888

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/config-server.jar"]