package com.example.jpa;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void save() {
        User user = new User(
                "아무개", "asd123@gmail.com", "서울"
        );
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public void getOne() {
        User user = userRepository.findById(1L).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 유저입니다.")
        );
    }

    @Transactional(readOnly = true)
    public void getAll() {
        List<User> users = userRepository.findAll();
    }

    @Transactional
    public void update() {
        User user = userRepository.findById(1L).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 유저입니다.")
        );
        user.update("아무개씨", "asdf1234@gmail.com", "경기도");
    }

    @Transactional(readOnly = true)
    public void delete() {
        boolean existence = userRepository.existsById(1L);
        if (!existence) {
            throw new IllegalStateException("존재하지 않는 유저입니다.");
        }

        userRepository.deleteById(1L);
    }
}
