package com.in28minutes.springboot.springtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @RequestMapping(value="login", method = RequestMethod.GET)
    public String goToLoginPage(){
        return "loginPage";
    }
    @RequestMapping(value="login", method = RequestMethod.POST)
    public String goToWelcomePage(
            @RequestParam String name,
            @RequestParam String password,
            ModelMap model
    ){
        model.put("name", name);
        model.put("password", password);
        return "welcome";

    }
}
