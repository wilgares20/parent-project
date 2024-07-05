package com.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Habilita la funcionalidad de servidor Eureka
@SpringBootApplication(exclude = { UserDetailsServiceAutoConfiguration.class })
public class EurekaServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args); // Inicia la aplicación Spring Boot
	}
}
