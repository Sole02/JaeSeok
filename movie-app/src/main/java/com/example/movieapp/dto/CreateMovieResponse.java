package com.example.movieapp.dto;

import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class CreateMovieResponse {

    private final Long id;
    private final String title;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifedAt;

    public CreateMovieResponse(Long id, String title, LocalDateTime createdAt, LocalDateTime modifedAt) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
        this.modifedAt = modifedAt;
    }
}
