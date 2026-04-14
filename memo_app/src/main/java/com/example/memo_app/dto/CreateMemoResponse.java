package com.example.memo_app.dto;

import lombok.Getter;

@Getter
public class CreateMemoResponse {

    private final Long id;
    private final String content;

    public CreateMemoResponse(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
