package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    @GetMapping("/")
    public @ResponseBody String index(){
        return "Hello World";
        // 문자 출력
    }

    @GetMapping("/fire")
    public String fire(){
        return "views/fire";
        // "뷰 템플릿 열기"
    }
}
