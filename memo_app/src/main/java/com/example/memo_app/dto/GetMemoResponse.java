package com.example.memo_app.dto;

import com.example.memo_app.entity.Memo;
import lombok.Getter;

@Getter
public class GetMemoResponse {

    private final Long id;
    private final String Content;

    public GetMemoResponse(Long id, String content) {
        this.id = id;
        Content = content;
    }
}
