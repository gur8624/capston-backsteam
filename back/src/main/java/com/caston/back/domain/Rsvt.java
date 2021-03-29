package com.caston.back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Rsvt {
    private LocalDateTime rsvt_dtt; // 예약신청일시
    private String chg_cd; // 충전기코드
    private String rsvt_start; // 예약시작시간
    private String rsvt_end; // 예약종료시간
    private String rsvt_cancel; // 예약취소시간
    private String u_id; // 아이디
}