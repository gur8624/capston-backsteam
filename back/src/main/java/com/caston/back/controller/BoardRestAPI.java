package com.caston.back.controller;

import com.caston.back.domain.Board;
import com.caston.back.domain.Question;
import com.caston.back.domain.User;
import com.caston.back.service.BoardService;
import com.caston.back.service.NaverApiService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log4j2
@RestController
@ResponseBody
@RequestMapping("/api")
public class BoardRestAPI {
    @Autowired(required = false)
    BoardService boardService;

    @Autowired(required = false)
    NaverApiService naverApiService;

    // 메인페이지 뉴스목록 5개
    @PostMapping("/main-news")
    public String news() {
        return naverApiService.getNaverNews();
    }

    // 메인페이지 공지사항목록 5개
    @PostMapping("/main-notify")
    public List<Board> MainNotifyList() {
        return boardService.getMainNotifyList();
    }

    // 웹 메인페이지 지도 마커 리스트
//    @GetMapping("/marker")
//    public String getMarkers() {
//
//    }

    // 글 리스트


    // 글 조회


    // 글 작성
    @PostMapping("/register")
    public void registerPost(@RequestBody Board board){
        boardService.register(board);
    }

    // 글 수정


    // 글 삭제


    // 활동 내역 (게시글 리스트)
    @PostMapping("/{u_id}/boardlist")
    public List<Board> myBoardList(@PathVariable String u_id) {
        log.info("[USER API (/{u_id}/boardlist)] USER_ID: " + u_id);
        return boardService.getMyBoardList(u_id);
    }
}
