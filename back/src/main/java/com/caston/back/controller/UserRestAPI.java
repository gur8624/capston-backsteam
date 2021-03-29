package com.caston.back.controller;

import com.caston.back.domain.User;
import com.caston.back.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Log4j2
public class UserRestAPI {

    @Autowired(required = false)
    UserService service;

    // 메인페이지
    @GetMapping("/")
    public String home() {
        return "main";
    }

    // 회원가입
    @GetMapping(value = "/signup")
    public String createForm() {
        return "/signup";
    }


    @PostMapping(value = "/signup")
    public String create(User user) {
        service.insertUser(user);
        return "redirect:/login";
    }

    // 로그인
    @GetMapping(value = "/login")
    public String loginForm() {
        return "/login";
    }


    @PostMapping(value = "/login")
    public String signIn(User user, HttpServletRequest request, RedirectAttributes attributes, Model model) {
        HttpSession session = request.getSession();
        User user2 = service.loginUser(user);
        if(user2 != null) {
            session.setAttribute("LoginUser", user2);
            model.addAttribute("id", user2.getU_id());
        }
        return "redirect:/";
    }

    @GetMapping(value = "/users")
    public String list() {
        return "/users";
    }

    // 로그아웃
    @GetMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = (HttpSession) request.getSession();
        session.removeAttribute("email");
        session.invalidate();
        return "redirect:";
    }

    // 회원정보 수정
    @PostMapping(value = "/update")
    public String updateUser(User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        service.updateUser(user);
        session.invalidate();
        return "redirect:";
    }

    @GetMapping(value = "/update")
    public String updateUser2() {
        return "/update";
    }


    // 회원정보 찾기
    @PostMapping(value = "/find")
    public String findUser(User user, Model model) {
        User Dto = service.findUser(user);
        model.addAttribute("findE", Dto.getU_email());
        model.addAttribute("findP", Dto.getU_pwd());
        return "/find";
    }

    @GetMapping(value = "/find")
    public void findPage() {

    }

}
