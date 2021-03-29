package com.caston.back.controller;

import com.caston.back.domain.Board;
import com.caston.back.domain.Question;
import com.caston.back.service.BoardService;
import com.caston.back.service.NaverApiService;
import com.caston.back.service.QuestionService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log4j2
@RestController
@ResponseBody
@RequestMapping("/api")
public class QuestionRestAPI {
    @Autowired(required = false)
    QuestionService questionService;

    // 문의 목록
    @PostMapping("/question")
    public List<Question> showQuestionList() {
        return questionService.getQuestionList();
    }

    // 문의 조회
    @PostMapping("/question/{q-number}")
    public Question showQuestion(@PathVariable String q_number) {
        return questionService.getQuestionById(q_number);
    }

    // 내 문의 목록
    @PostMapping("/my-question")
    public List<Question> showMyQuestion(@RequestBody Question question) {
        log.info("[API (/my-question)] USER_ID: " + question.getU_id());
        return questionService.getMyQuestionList(question.getU_id());
    }

    // 충전소 이용내역


}
