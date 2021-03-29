package com.caston.back.mapper;

import com.caston.back.domain.Question;

import java.util.List;

public interface QuestionMapper {
    List<Question> getQuestionList(); // 문의 리스트

    Question getQuestionById(String q_dtt); // 문의 조회

    List<Question> getMyQuestionList(String u_id); // 내 문의 리스트

}
