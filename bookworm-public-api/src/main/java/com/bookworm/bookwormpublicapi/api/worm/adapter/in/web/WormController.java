package com.bookworm.bookwormpublicapi.api.worm.adapter.in.web;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import com.bookworm.bookwormpublicapi.api.worm.adapter.in.web.dto.request.LoginRequest;
import com.bookworm.bookwormpublicapi.api.worm.application.port.in.LoginUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class WormController {
    private final LoginUseCase loginUseCase;

    @PostMapping("/login")
    public Mono<ResponseEntity<CommonResponse>> login(@RequestBody LoginRequest loginRequest) {
        return loginUseCase.login(loginRequest.getUserId(), loginRequest.getPassword());
    }
}
