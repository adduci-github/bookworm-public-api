package com.bookworm.bookwormpublicapi.api.worm.adapter.out.client.external;

import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.net.URI;

public interface ServiceClient {
    <T,U> Mono<ResponseEntity<U>> post(URI path, T request, Class<U> responseType);
}
