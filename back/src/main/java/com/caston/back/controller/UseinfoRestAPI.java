package com.caston.back.controller;

import com.caston.back.domain.Useinfo;
import com.caston.back.service.UseinfoService;
import com.caston.back.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log4j2
@RestController
@ResponseBody
@RequestMapping("/api")
public class UseinfoRestAPI {
    @Autowired(required = false)
    UseinfoService useinfoService;

    // 충전소 이용 내역
    @PostMapping("/myuseinfo")
    public List<Useinfo> getMyUseInfoList(@RequestBody Useinfo useinfo) {
        return useinfoService.getMyUseInfoList(useinfo.getU_id());
    }
}
