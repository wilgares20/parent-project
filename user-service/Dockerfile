FROM openjdk:11-jre-slim

WORKDIR /app

ADD target/user-service-1.0.0.jar /app/user-service.jar

EXPOSE 8080

# Especificar el comando para ejecutar el servicio Eureka
CMD ["java", "-jar", "/app/user-service.jar"]