package com.caston.back.domain;

import lombok.Data;

@Data
public class File {
    private String f_no; // 파일번호(시퀀스)
    private String b_no; // 글 번호 (카테고리 1Byte + 작성일시 12Byte)
    private String f_ori_nm; // 이름
    private String f_sv_nm; // 서버에 저장되는 이름
    private int f_capacity; // 용량
    private String f_ext; // 확장자
}
