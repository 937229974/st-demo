package com.st.sys.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    /*
    * 登录
    * */
    @RequestMapping("/login")
    public String login(){
        return "index";
    }

    /*
    * test
    * */
    @RequestMapping("/show")
    public String show(){
        return "show";
    }
}
