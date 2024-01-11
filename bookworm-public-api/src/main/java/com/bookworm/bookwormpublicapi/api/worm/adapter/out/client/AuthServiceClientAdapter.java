package com.bookworm.bookwormpublicapi.api.worm.adapter.out.client;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import com.bookworm.bookwormpublicapi.api.worm.adapter.in.web.dto.request.LoginRequest;
import com.bookworm.bookwormpublicapi.api.worm.adapter.out.client.external.ServiceClient;
import com.bookworm.bookwormpublicapi.api.worm.application.port.out.LoginPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class AuthServiceClientAdapter implements LoginPort {
    private final ServiceClient authServiceClient;

    @Override
    public Mono<ResponseEntity<CommonResponse>> login(String userId, String password) {
        return authServiceClient.post(URI.create("/authentication"), new LoginRequest(userId, password), CommonResponse.class);
    }
}
