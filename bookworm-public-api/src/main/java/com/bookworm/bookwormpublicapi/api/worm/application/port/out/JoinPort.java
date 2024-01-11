package com.bookworm.bookwormpublicapi.api.worm.application.port.out;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import com.bookworm.bookwormpublicapi.api.worm.application.domain.Join;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface JoinPort {
    Mono<ResponseEntity<CommonResponse>> join(Join join);
}
