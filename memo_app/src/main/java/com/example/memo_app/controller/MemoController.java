package com.example.memo_app.controller;

import com.example.memo_app.dto.*;
import com.example.memo_app.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @PostMapping("/memos")
    public ResponseEntity<CreateMemoResponse> createMemo(@RequestBody CreateMemoRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(memoService.save(request));
    }

    @GetMapping("/memos/{memoId}")
    public ResponseEntity<GetMemoResponse> getOneMemo(@PathVariable Long memoId) {
        return ResponseEntity.status(HttpStatus.OK).body(memoService.findOne(memoId));
    }

    @GetMapping("/memos")
    public ResponseEntity<List<GetMemoResponse>> getAllMemos() {
        return ResponseEntity.status(HttpStatus.OK).body(memoService.findAll());
    }

    @PatchMapping("/memos/{memoId}")
    public ResponseEntity<UpdateMemoResponse> updateMemoContents(@PathVariable Long memoId, @RequestBody UpdateMemoRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(memoService.update(memoId, request));
    }

    @DeleteMapping("/memos/{memoId}")
    public ResponseEntity<Void> deleteMemo(@PathVariable Long memoId) {
        memoService.delete(memoId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
