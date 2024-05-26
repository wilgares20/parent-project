
# Usar una imagen de Java 11 liviana
FROM openjdk:11-jre-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR del servicio Eureka al contenedor
COPY target/eureka-service-1.0.0.jar /app/eureka-service.jar

# Especificar el comando para ejecutar el servicio Eureka
CMD ["java", "-jar", "/app/eureka-service.jar"]

