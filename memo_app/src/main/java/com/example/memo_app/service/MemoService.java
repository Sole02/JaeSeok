package com.example.memo_app.service;

import com.example.memo_app.dto.*;
import com.example.memo_app.entity.Memo;
import com.example.memo_app.reqository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public CreateMemoResponse save(CreateMemoRequest request) {
        Memo memo = new Memo(request.getContents());
        Memo savedMemo = memoRepository.save(memo);
        return new CreateMemoResponse(
                savedMemo.getId(),
                savedMemo.getContents()
        );
    }

    @Transactional(readOnly = true)
    public GetMemoResponse findOne(Long memoId) {
        Memo memo = memoRepository.findById(memoId).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 메모입니다.")
        );
        return new GetMemoResponse(
                memo.getId(),
                memo.getContents()
        );
    }

    @Transactional(readOnly = true)
    public List<GetMemoResponse> findAll() {
        List<Memo> memos = memoRepository.findAll();

        List<GetMemoResponse> dtos = new ArrayList<>();
        for (Memo memo : memos) {
            GetMemoResponse dto = new GetMemoResponse(
                    memo.getId(),
                    memo.getContents()
            );
            dtos.add(dto);
        }
        return dtos;
    }

    @Transactional
    public UpdateMemoResponse update(Long memoId, UpdateMemoRequest request) {
        Memo memo = memoRepository.findById(memoId).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 메모입니다.")
        );

        memo.updateContent(request.getContents());
        return new UpdateMemoResponse(
                memo.getId(),
                memo.getContents()
        );
    }

    public void delete(Long memoId) {
        boolean existence = memoRepository.existsById(memoId);

        // Id값이 존재하지 않으면
        if (!existence) {
            throw new IllegalArgumentException("존재하지 않는 메모입니다.");
        }

        // Id값이 존재 하면
        memoRepository.deleteById(memoId);
    }
}
