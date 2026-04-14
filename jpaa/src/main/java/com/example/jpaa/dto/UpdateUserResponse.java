package com.example.jpaa.dto;

import lombok.Getter;

@Getter
public class UpdateUserResponse {

    private final Long id;
    private final String Name;
    private final String email;
    private final String address;

    public UpdateUserResponse(Long id, String name, String email, String address) {
        this.id = id;
        Name = name;
        this.email = email;
        this.address = address;
    }
}
