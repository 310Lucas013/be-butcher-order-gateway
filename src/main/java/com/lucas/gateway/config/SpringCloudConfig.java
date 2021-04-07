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
                        .uri("http://bo-credentials:8080/"))
                .route(r -> r.path("/customer/**")
                        .uri("http://bo-customer:8080/"))
                .route(r -> r.path("/location/**")
                        .uri("http://bo-location:8080/"))
                .route(r -> r.path("/butcher/**")
                        .uri("http://bo-butcher:8080/"))
                .route(r -> r.path("/order/**")
                        .uri("http://bo-order:8080/"))
                .route(r -> r.path("/product/**")
                        .uri("http://bo-product:8080/"))
                .build();
    }
}
