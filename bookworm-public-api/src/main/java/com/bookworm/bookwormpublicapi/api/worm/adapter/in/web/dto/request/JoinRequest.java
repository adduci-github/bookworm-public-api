package com.bookworm.bookwormpublicapi.api.worm.adapter.in.web.dto.request;

import com.bookworm.bookwormpublicapi.api.worm.application.domain.Join;
import lombok.Data;

@Data
public class JoinRequest {
    private String userId;
    private String password;
    private String nickname;

    public Join toJoin() {
        return new Join(userId, password, nickname);
    }
}
