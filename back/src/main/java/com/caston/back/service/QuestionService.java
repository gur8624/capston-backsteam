package com.caston.back.service;

import com.caston.back.domain.Question;
import com.caston.back.mapper.QuestionMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class QuestionService {

    @Autowired(required = false)
    QuestionMapper questionMapper;

    // 문의 리스트
    public List<Question> getQuestionList() {
        return questionMapper.getQuestionList();
    }

    // 문의 조회
    public Question getQuestionById(String q_dtt) {
        return questionMapper.getQuestionById(q_dtt);
    }

    // 내 문의 리스트
    public List<Question> getMyQuestionList(String u_id) {
        List<Question> list = questionMapper.getMyQuestionList(u_id);

        list.forEach(question -> {
            question.setDate(question.getQ_dtt());
            question.setTime(question.getQ_dtt());
        });

        return list;
    }

}
