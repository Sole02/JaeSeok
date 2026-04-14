package com.example.schedules.service;

import com.example.schedules.dto.ScheduleRequest;
import com.example.schedules.dto.ScheduleResponse;
import com.example.schedules.entity.Schedules;
import com.example.schedules.repository.SchedulesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final SchedulesRepository schedulesRepository;

    @Transactional
    public ScheduleResponse createSchedule(ScheduleRequest request) {
        Schedules schedule = new Schedules(
                request.getTitle(),
                request.getContent(),
                request.getName(),
                request.getPassword()
        );
        Schedules savedSchedule = schedulesRepository.save(schedule);
        return new ScheduleResponse(savedSchedule);
    }

    @Transactional(readOnly = true)
    public List<ScheduleResponse> findAll() {
        List<Schedules> schedules = schedulesRepository.findAll();

        List<ScheduleResponse> dtos = new ArrayList<>();
        for (Schedules schedule : schedules) {
            ScheduleResponse dto = new ScheduleResponse(schedule);
            dtos.add(dto);
        }
        return dtos;
    }

    @Transactional
    public ScheduleResponse update(Long scheduleId, ScheduleRequest request) {
        Schedules schedule = schedulesRepository.findById(scheduleId).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 일정입니다.")
        );
        if (!schedule.getPassword().equals(request.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        schedule.update(request.getTitle(), request.getContent(), request.getName());
        return new ScheduleResponse(schedule);
    }

    @Transactional
    public void delete(Long scheduleId) {
        boolean exists = schedulesRepository.existsById(scheduleId);
        if (!exists) {
            throw new IllegalArgumentException("존재하지 않는 일정입니다.");
        }
        schedulesRepository.deleteById(scheduleId);
    }
}
