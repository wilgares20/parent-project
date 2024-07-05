//package com.zuulgateway;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
//public class CORS {
//
//    @Bean
//    public CorsWebFilter corsWebFilter() {
//        // Crear una nueva configuración de CORS
//        CorsConfiguration corsConfig = new CorsConfiguration();
//
//        // Permitir solicitudes desde cualquier origen
//        corsConfig.setAllowedOrigins(Arrays.asList("*"));
//
//        // Establecer el tiempo máximo de vida de la configuración en 3600 segundos (1 hora)
//        corsConfig.setMaxAge(3600L);
//
//        // Permitir todos los métodos HTTP (GET, POST, PUT, DELETE, etc.)
//        corsConfig.addAllowedMethod("*");
//
//        // Permitir todos los encabezados HTTP
//        corsConfig.addAllowedHeader("*");
//
//        // Crear una fuente de configuración basada en URL
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//
//        // Registrar la configuración de CORS para todas las rutas (/**)
//        source.registerCorsConfiguration("/**", corsConfig);
//
//        // Devolver un filtro web CORS configurado con la fuente
//        return new CorsWebFilter(source);
//    }
//}
