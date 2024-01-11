package com.bookworm.bookwormpublicapi.config;

import lombok.Getter;

@Getter
public enum Services {
    BOOKWORM_AUTH("bookworm-auth");

    private final String name;

    Services(String name) {
        this.name = name;
    }
}
