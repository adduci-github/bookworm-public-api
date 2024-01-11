package com.bookworm.bookwormpublicapi.api.worm.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Join {
    private String userId;
    private String password;
    private String nickname;
}
