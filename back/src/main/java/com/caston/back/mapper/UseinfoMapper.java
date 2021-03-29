package com.caston.back.mapper;

import com.caston.back.domain.Useinfo;

import java.util.List;

public interface UseinfoMapper {
    List<Useinfo> getMyUseInfoList(String u_id); // 내 활동내역
}
