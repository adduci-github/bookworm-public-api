package com.bookworm.bookwormpublicapi.api.worm.adapter.out.client.external;

import com.bookworm.bookwormpublicapi.config.GatewayConfig;
import com.bookworm.bookwormpublicapi.config.Services;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
public class AuthServiceClient implements ServiceClient {
    private final WebClient webClient;
    private final Services service;

    public AuthServiceClient(GatewayConfig gatewayConfig) {
        this.webClient = WebClient.builder()
                .baseUrl(gatewayConfig.getUrl())
                .build();
        this.service = Services.BOOKWORM_AUTH;
    }

    @Override
    public <T, U> Mono<ResponseEntity<U>> post(URI path, T request, Class<U> responseType) {
        return webClient.post()
                .uri(service.getName().concat("/" + path.toString()))
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(request), request.getClass())
                .exchangeToMono(response -> response.bodyToMono(responseType).map(body -> ResponseEntity.status(response.statusCode()).body(body)));
    }
}
