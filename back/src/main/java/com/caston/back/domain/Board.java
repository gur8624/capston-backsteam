package com.caston.back.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Board {
    private char cat_cd;
    private String b_title;
    private String b_content;
    private String file;
    private LocalDateTime b_dtt;
    private String u_id;
}
