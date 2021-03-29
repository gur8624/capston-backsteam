package com.caston.back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Check {
    private LocalDateTime ck_dtt; // 점검일시
    private String bol_cd; // 볼라드코드
    private String ck_reason; // 점검사유
    private String ck_nm; // 점검자
}
