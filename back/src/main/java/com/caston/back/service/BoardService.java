package com.caston.back.service;

import com.caston.back.domain.Board;
import com.caston.back.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class BoardService {

    @Autowired(required = false)
    BoardMapper boardMapper;

    public List<Board> getMainNotifyList() {
        return boardMapper.getMainNotifyList();
    }

    public void register(Board board) {
        boardMapper.insertBoard(board);
    }

    // 활동내역 (게시글 리스트)
    public List<Board> getMyBoardList(String u_id) {
        return boardMapper.getMyBoardList(u_id);
    }
}
