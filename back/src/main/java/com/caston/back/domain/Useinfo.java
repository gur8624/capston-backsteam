package com.caston.back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Useinfo {
    private LocalDateTime use_dtt; // 사용일시
    private String chg_cd; // 충전기코드
    private char use_rsvt; // 예약여부
    private int use_payment; // 결제금액
    private int use_chg_amt; // 충전량
    private String u_id; // 아이디
}
