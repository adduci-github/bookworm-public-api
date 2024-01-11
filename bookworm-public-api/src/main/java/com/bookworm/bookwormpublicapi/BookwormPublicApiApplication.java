package com.bookworm.bookwormpublicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class BookwormPublicApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookwormPublicApiApplication.class, args);
    }

}
