package com.caston.back.controller;

import com.caston.back.domain.Board;
import com.caston.back.domain.Reply;
import com.caston.back.domain.User;
import com.caston.back.service.ReplyService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@ResponseBody
@RequestMapping("/api")
public class ReplyRestAPI {

    @Autowired(required = false)
    ReplyService replyService;

    @PostMapping("/replylist")
    public List<Reply> replyList(@RequestBody Board board) {
        log.info("[REPLY API (/replylist)] USER_ID: " + board);
        return replyService.getReplyList(board.getCat_cd(), board.getB_dtt().toString());
    }

    // 내 문의 목록
    @PostMapping("/{u_id}/replylist")
    public List<Reply> myReplylist(@PathVariable String u_id) {
        log.info("[REPLY API (/{u_id}/replylist)] USER_ID: " + u_id);
        return replyService.getMyReplyList(u_id);
    }
}
