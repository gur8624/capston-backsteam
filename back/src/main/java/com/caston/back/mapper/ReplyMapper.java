package com.caston.back.mapper;

import com.caston.back.domain.Reply;

import java.util.List;

public interface ReplyMapper {
    List<Reply> getReplyList(String b_no);

    List<Reply> getMyReplyList(String u_id); // 내 댓글 목록
}
