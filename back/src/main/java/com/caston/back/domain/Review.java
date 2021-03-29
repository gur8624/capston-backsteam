package com.caston.back.domain;

import lombok.Data;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

@Data
public class Review {
    private LocalDateTime re_reg_dtt; // 리뷰작성일
    private String stat_id; // 충전소아이디
    private String re_content; // 리뷰내용
    private String re_writer; // 리뷰작성자
}