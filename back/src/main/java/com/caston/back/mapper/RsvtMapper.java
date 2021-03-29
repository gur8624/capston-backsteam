package com.caston.back.mapper;

import com.caston.back.domain.Rsvt;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RsvtMapper {
    List<Rsvt> getTodaysRsvt(Rsvt rsvt); // 일정 일자 예약리스트

    int insertReservation(Rsvt rsvt); // 예약하기

    // 예약 수정

    // 내 예약 조회

    void deleteRsvtByDtt(Rsvt rsvt);// 예약 취소
}
