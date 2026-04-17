package com.example.schedule_app.dto.response;

public class ScheduleCreateResponseDto {
    // 일정 등록 응답 dto

    // 속성
    private Long id;
    private String title;
    private String content;

    // 생성자
    public ScheduleCreateResponseDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // 기능
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
}
