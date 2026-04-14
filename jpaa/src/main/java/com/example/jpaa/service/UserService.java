package com.example.jpaa.service;

import com.example.jpaa.dto.*;
import com.example.jpaa.entity.User;
import com.example.jpaa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 저장
    @Transactional
    public CreateUserResponse save(CreateUserRequest request) {
        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getAddress()
        );
        User savedUser = userRepository.save(user);
        return new CreateUserResponse(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getAddress(),
                savedUser.getCreatedAt(),
                savedUser.getModifiedAt()
        );
    }

    // 단건 조회
    @Transactional(readOnly = true)
    public GetOneUserResponse getOne(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 유저 입니다.")
        );

        return new GetOneUserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getAddress()
        );
    }

    // 다건 조회
    @Transactional(readOnly = true)
    public List<GetOneUserResponse> getAll() {
        List<User> users = userRepository.findAll();

        List<GetOneUserResponse> dtos = new ArrayList<>();
        for (User user : users) {
            GetOneUserResponse dto = new GetOneUserResponse(
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    user.getAddress()
            );
            dtos.add(dto);
        }
        return dtos;
    }

    // 수정
    @Transactional
    public UpdateUserResponse update(Long userId, UpdateUserRequest request) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 유저입니다.")
        );

        user.update(
                request.getName(),
                request.getEmail(),
                request.getAddress()
        );
        return new UpdateUserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getAddress()
        );
    }

    // 삭제
    @Transactional
    public void delete(Long userId) {
        boolean existence = userRepository.existsById(userId);

        // 유저가 없는 경우
        if (!existence) {
            throw new IllegalStateException("존재하지 않는 유저입니다.");
        }

        // 유저가 있는 경우
        userRepository.deleteById(userId);
    }
}
