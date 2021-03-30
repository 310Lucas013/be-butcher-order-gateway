package com.lucas.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/credentials/**")
                        .uri("http://localhost:6002/"))
                .route(r -> r.path("/customer/**")
                        .uri("http://localhost:6003/"))
                .route(r -> r.path("/location/**")
                        .uri("http://localhost:6004/"))
                .route(r -> r.path("/butcher/**")
                        .uri("http://localhost:6005/"))
                .route(r -> r.path("/order/**")
                        .uri("http://localhost:6006/"))
                .route(r -> r.path("/product/**")
                        .uri("http://localhost:6007/"))
                .build();
    }
}
