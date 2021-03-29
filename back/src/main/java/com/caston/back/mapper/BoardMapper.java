package com.caston.back.mapper;

import com.caston.back.domain.Board;
import com.caston.back.domain.Question;

import java.util.List;

public interface BoardMapper {
    List<Board> getMainNotifyList();

    void insertBoard(Board board); //글 작성

    List<Board> getMyBoardList(String u_id); // 활동내역 (게시글)
}
