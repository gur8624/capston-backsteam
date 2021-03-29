package com.caston.back.domain;

import lombok.Data;

@Data
public class UserCard {
    private String agcy_id; // 기관 아이디
    private String u_id; // 아이디 (아이디 15 + 권한 1)
    private String uc_no; // 회원번호
    private String uc_issue_dt; // 발행년월
}
