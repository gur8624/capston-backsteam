package com.caston.back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Agency {
    private String agcy_id; // 기관아이디
    private String agcy_nm; // 운영기관명
    private int agcy_bs_R; // 기본요금
    private int agcy_fee; // 이용수수료
    private int agcy_dc; // 할인율
    private String agcy_card; // 카드이미지
    private LocalDateTime agcy_up_dtt; // 갱신일시
}
