package com.bookworm.bookwormpublicapi.api.worm.application.port.out;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface LoginPort {
    Mono<ResponseEntity<CommonResponse>> login(String userId, String password);
}
