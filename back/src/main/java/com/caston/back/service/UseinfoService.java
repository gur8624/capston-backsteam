package com.caston.back.service;

import com.caston.back.domain.Useinfo;
import com.caston.back.mapper.UseinfoMapper;
import com.caston.back.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class UseinfoService {

    @Autowired(required = false)
    UseinfoMapper useinfoMapper;

    public List<Useinfo> getMyUseInfoList(String u_id){
        return useinfoMapper.getMyUseInfoList(u_id);
    }

}
