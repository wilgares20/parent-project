package com.central.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// Habilitar el servidor de configuración
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
//@EnableDiscoveryClient
public class ConfigServerApplication {

	public static void main(String[] args) {
		// Iniciar la aplicación Spring Boot
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
