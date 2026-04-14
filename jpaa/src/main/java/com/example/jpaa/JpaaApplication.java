package com.example.jpaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaaApplication.class, args);
    }

}
