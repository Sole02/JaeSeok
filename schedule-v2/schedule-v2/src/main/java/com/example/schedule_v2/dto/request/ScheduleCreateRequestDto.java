package com.example.schedule_v2.dto.request;

public class ScheduleCreateRequestDto {
    // 일정 등록 요청 dto

    // 속성
    private String title;
    private String content;

    // 생성자
    public ScheduleCreateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 기능
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
}
