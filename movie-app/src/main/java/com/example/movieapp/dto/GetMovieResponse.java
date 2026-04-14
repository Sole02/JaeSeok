package com.example.movieapp.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetMovieResponse {

    private final Long id;
    private final String title;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifedAt;

    public GetMovieResponse(Long id, String title, LocalDateTime createdAt, LocalDateTime modifedAt) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
        this.modifedAt = modifedAt;
    }
}
