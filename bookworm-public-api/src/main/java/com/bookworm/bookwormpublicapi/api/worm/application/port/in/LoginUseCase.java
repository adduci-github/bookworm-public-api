package com.bookworm.bookwormpublicapi.api.worm.application.port.in;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface LoginUseCase {
    Mono<ResponseEntity<CommonResponse>> login(String userId, String password);
}
