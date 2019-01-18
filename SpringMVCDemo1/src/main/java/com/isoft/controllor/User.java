package com.isoft.controllor;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {
    @RequestMapping("/test")
    @ResponseBody
    public String test(String uname,String upwd,String rupwd){
        System.out.println("test"+uname+"-"+upwd+"-"+rupwd);
        return "true";
    }
}
