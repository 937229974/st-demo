package com.st.sys.user.controller;

import com.st.comment.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
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
        ResponseModel.RESPONSE_FAIL.getCode();
        return "show";

    }
}
