package com.example.movieapp.dto;

import lombok.Getter;

@Getter
public class UpdateMovieResponse {

    private final Long id;

    public UpdateMovieResponse(Long id) {
        this.id = id;
    }
}
