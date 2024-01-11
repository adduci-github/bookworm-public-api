package com.bookworm.bookwormpublicapi.api.worm.application.service;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import com.bookworm.bookwormpublicapi.api.worm.application.port.in.LoginUseCase;
import com.bookworm.bookwormpublicapi.api.worm.application.port.out.LoginPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class LoginService implements LoginUseCase {
    private final LoginPort loginPort;

    public Mono<ResponseEntity<CommonResponse>> login(String userId, String password) {
        return loginPort.login(userId, password);
    }
}
