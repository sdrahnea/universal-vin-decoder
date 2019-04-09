package com.uvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by sdrahnea
 */
@SpringBootApplication
@EnableJpaRepositories
public class UniversalVinDecoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversalVinDecoderApplication.class, args);
    }
}
