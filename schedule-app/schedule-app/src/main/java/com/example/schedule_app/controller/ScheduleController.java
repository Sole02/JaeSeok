package com.example.schedule_app.controller;

import com.example.schedule_app.dto.request.ScheduleCreateRequestDto;
import com.example.schedule_app.dto.response.ScheduleCreateResponseDto;
import com.example.schedule_app.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

@RestController // 1. 컴포넌트 스캔
@RequestMapping("/schedule") // 2. 리퀘스트 맵핑
public class ScheduleController {

    // 속성


    // 생성자
    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    // 기능

    // 일정 등록
    @PostMapping
    public ScheduleCreateResponseDto createSchedule(@RequestBody ScheduleCreateRequestDto requestDto) {
        return scheduleService.createSchedule(requestDto);
    }
}
