package com.caston.back.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Bolad {
    private String bol_cd;
    private String chg_cd;
    private char bol_st;
    private Date bol_setup_dt;
}
