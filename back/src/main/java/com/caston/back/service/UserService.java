package com.caston.back.service;

import com.caston.back.domain.User;
import com.caston.back.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    //회원가입
    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    // 로그인
    public User loginUser(User user) {
        log.info("아이디" + user);

        return userMapper.loginUser(user);
    }

    // 회원정보 수정
    public void updateUser(User user) {
        userMapper.loginUser(user);
        userMapper.updateUser(user);
    }

    // 회원찾기
    public User findUser(User user) {
        log.info("아이디찾기~~~" + user);
        return userMapper.findUser(user);

    }


}
