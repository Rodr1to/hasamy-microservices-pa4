package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()

                // Catálogo
                .route("ms-catalogo", r -> r
                        .path("/api/catalogo/**")
                        .uri("http://localhost:9090"))

                // Persona
                .route("ms-persona", r -> r
                        .path("/api/persona/**")
                        .uri("http://localhost:9091"))

                // Seguridad
                .route("ms-seguridad", r -> r
                        .path("/api/seguridad/**")
                        .uri("http://localhost:9092"))

                // Finanzas
                .route("ms-finanzas", r -> r
                        .path("/api/finanzas/**")
                        .uri("http://localhost:9093"))

                // Operaciones
                .route("ms-operaciones", r -> r
                        .path("/api/operaciones/**")
                        .uri("http://localhost:9094"))

                .build();
    }
}