package com.caston.back.domain;

import lombok.Data;

@Data
public class Station {
    private String stat_id; // 충전소아이디
    private String stat_nm; // 충전소명
    private String stat_addr; // 도로명주소
    private char stat_p_free; // 주차료무료여부
    private int stat_p_fee; // 주차요금
    private String stat_zcode; // 지역코드
    private String stat_lat; // 위도
    private String stat_lng; // 경도
}
