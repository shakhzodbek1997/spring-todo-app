package com.in28minutes.springboot.springtodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you Learning?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHTML(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>HTML Page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("real HTML page");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJSP(){
        return "sayHello";
    }
}
