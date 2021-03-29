package com.caston.back.service;

import com.caston.back.domain.Reply;
import com.caston.back.domain.Rsvt;
import com.caston.back.mapper.RsvtMapper;
import com.caston.back.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@Log4j2
public class RsvtService {

    @Autowired(required = false)
    RsvtMapper rsvtMapper;

    public List<Rsvt> getTodaysRsvt(Rsvt rsvt) {
        return rsvtMapper.getTodaysRsvt(rsvt);
    }

    public int insertReservation(Rsvt rsvt) {
       return rsvtMapper.insertReservation(rsvt);
    }

    public void deleteRsvtByDtt(Rsvt rsvt) {
        rsvtMapper.deleteRsvtByDtt(rsvt);
    }
}
