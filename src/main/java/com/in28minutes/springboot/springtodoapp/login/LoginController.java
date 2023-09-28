package com.in28minutes.springboot.springtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=satish
    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        System.out.println("Request Param is: " + name); // Just testing Purpose
        return "loginPage";
    }
}
