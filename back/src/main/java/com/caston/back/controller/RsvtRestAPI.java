package com.caston.back.controller;

import com.caston.back.domain.Rsvt;
import com.caston.back.service.RsvtService;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@ResponseBody
@RequestMapping("/api")
public class RsvtRestAPI {

    @Autowired
    RsvtService rsvtService;

    // 해당 일 예약 조회
    @PostMapping("/todays-reservation")
    public List<Rsvt> TodaysRsvt(@RequestBody Rsvt rsvt) {
        log.info("[RsvtAPI (/todays-reservation)] Rsvt: " + rsvt);
        return rsvtService.getTodaysRsvt(rsvt);
    }

    // 예약 하기
    @PutMapping("/reservation")
    public Rsvt reservation(@RequestBody Rsvt rsvt) {
        log.info("[RsvtAPI (/reservation)] Rsvt: " + rsvt);
        int result = rsvtService.insertReservation(rsvt);

        if(result > 0) {
            return rsvt;
        }

        return null;
    }

    // 예약 수정

    // 내 예약 조회

    // 예약 취소
    @Delete("/{u_id}/reservation")
    public void deleteRsvtByDtt(@RequestBody Rsvt rsvt) {
        log.info("[RsvtAPI (/{u_id}/reservation)] Rsvt: " + rsvt);
        rsvtService.deleteRsvtByDtt(rsvt);
    }
}
