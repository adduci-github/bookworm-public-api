package com.bookworm.bookwormpublicapi.api.worm.application.service;

import com.bookworm.bookwormpublicapi.api.common.CommonResponse;
import com.bookworm.bookwormpublicapi.api.worm.application.domain.Join;
import com.bookworm.bookwormpublicapi.api.worm.application.port.in.JoinUseCase;
import com.bookworm.bookwormpublicapi.api.worm.application.port.out.JoinPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class JoinService implements JoinUseCase {
    private final JoinPort joinPort;

    @Override
    public Mono<ResponseEntity<CommonResponse>> join(Join join) {
        return joinPort.join(join);
    }
}
