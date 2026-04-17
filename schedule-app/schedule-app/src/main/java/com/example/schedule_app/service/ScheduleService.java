package com.example.schedule_app.service;

import com.example.schedule_app.dto.request.ScheduleCreateRequestDto;
import com.example.schedule_app.dto.response.ScheduleCreateResponseDto;
import com.example.schedule_app.entity.Schedule;
import com.example.schedule_app.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    // 속성
    private final ScheduleRepository scheduleRepository;

    // 생성자
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    // 기능
    public ScheduleCreateResponseDto createSchedule(ScheduleCreateRequestDto requestDto) {
        Schedule schedule = new Schedule(requestDto.getTitle(), requestDto.getContent());
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new ScheduleCreateResponseDto(savedSchedule.getId(), savedSchedule.getTitle(), savedSchedule.getContent());
    }
}
