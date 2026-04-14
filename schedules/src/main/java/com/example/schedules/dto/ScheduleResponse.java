package com.example.schedules.dto;

import com.example.schedules.entity.Schedules;
import lombok.Getter;

@Getter
public class ScheduleResponse {
    private Long id;
    private String title;
    private String content;
    private String name;

    public ScheduleResponse(Schedules schedule) {
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.content = schedule.getContent();
        this.name = schedule.getName();
    }
}
