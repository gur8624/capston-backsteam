package com.caston.back.mapper;

import com.caston.back.domain.Board;
import com.caston.back.domain.User;

import java.util.List;

public interface UserMapper {
    // 회원가입
    void insertUser(User user);

    // 로그인
    User loginUser(User user);

    // 회원정보 수정
    void updateUser(User user);

    // 회원찾기
    User findUser(User user);

}
