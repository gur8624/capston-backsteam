package com.caston.back.service;

import com.caston.back.domain.Reply;
import com.caston.back.mapper.ReplyMapper;
import com.caston.back.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Log4j2
public class ReplyService {

    @Autowired(required = false)
    ReplyMapper replyMapper;

    public List<Reply> getReplyList(char cat_cd, String b_dtt) {
        String b_no = cat_cd + b_dtt;
        return replyMapper.getReplyList(b_no);
    }

    public List<Reply> getMyReplyList(String u_id) {
        return replyMapper.getMyReplyList(u_id);
    }
}
