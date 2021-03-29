package com.caston.back.domain;

import lombok.Data;

@Data
public class Charger {
    private String chg_cd; // 충전기 코드
    private String chg_type; // 충전기타입 (01:DC차데모, 02:AC완속, 03:DC차데모+AC3상, 04: DC콤보, 05:DC차데모+DC콤보, 06: DCckepah+AC3상+DC콤보, 07:AC3상)
    private String chg_use_time; // 이용가능시간
    private String chg_agcy_call; // 관리업체전화번호
    private char ghc_st; // 상태 (1:통신이상, 2:충전대기, 3:충전중, 4: 운영중지, 5:점검중, 9:상태미확인)
    private String chg_st_dt; // 상태갱신일시
    private String chg_pwr_type; // 충전량
    private char chg_rsvt; // 예약가능여부
    private String agcy_id; // 기관아이디
}
