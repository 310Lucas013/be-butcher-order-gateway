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
                        .uri("http://bo-credentials:6000/"))
                .route(r -> r.path("/customers/**")
                        .uri("http://bo-customer:6000/"))
                .route(r -> r.path("/locations/**")
                        .uri("http://bo-location:6000/"))
                .route(r -> r.path("/butchers/**")
                        .uri("http://bo-butcher:6000/"))
                .route(r -> r.path("/orders/**")
                        .uri("http://bo-order:6000/"))
                .route(r -> r.path("/products/**")
                        .uri("http://bo-product:6000/"))
                .build();
    }
}
