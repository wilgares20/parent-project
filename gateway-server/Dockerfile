# # Usar una imagen base de OpenJDK (Slim)
# FROM openjdk:11-jdk-slim
#
# # Establecer el directorio de trabajo
# WORKDIR /app
#
# # Copiar el archivo JAR de la aplicación al contenedor
# COPY target/gateway-server-1.0.0.jar app.jar
#
# # Exponer el puerto que usará la aplicación
# EXPOSE 8777
#
# # Comando para ejecutar la aplicación
# ENTRYPOINT ["java", "-jar", "app.jar"]


# Usar una imagen de Java 11 liviana
FROM openjdk:11-jre-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR del servidor de puerta de enlace al contenedor
COPY target/gateway-server-1.0.0.jar /app/gateway-server.jar

# Especificar el comando para ejecutar el servidor de puerta de enlace
CMD ["java", "-jar", "/app/gateway-server.jar"]

