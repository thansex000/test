package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller {
    @RequestMapping ("home")
    @ResponseBody
        public String index(){
    return "hello I'm TSCODE";
        }
}
