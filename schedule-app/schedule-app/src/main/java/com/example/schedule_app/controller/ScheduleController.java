package com.example.schedule_app.controller;

import com.example.schedule_app.dto.ScheduleControllerRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {








    @PostMapping
    public void creatSchedule(@RequestBody ScheduleControllerRequestDto requestDto) {
        System.out.println("ScheduleController.creatSchedule()");
    }
}
