package com.in28minutes.springboot.springtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
    @RequestMapping("login")
    public String goToLoginPage(){
        return "loginPage";
    }
}
