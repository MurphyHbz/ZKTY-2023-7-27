package com.mys.zkty.controller;

import com.mys.zkty.pojo.User;
import com.mys.zkty.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "/login",method = RequestMethod.POST,consumes = "application/json;charset=UTF-8")
    public String login(@RequestBody User user){
        User userlogin=null;
        boolean mark=false;
        try {
            userlogin= loginService.login(user.getUsername(), user.getPassword());
        }catch (Exception ex){
            mark=true;
        }
        if(mark==true){
            return "error";
        }else{
            if (userlogin==null){
                return "error";
            }else {
                return "success" ;
            }
        }
    }

}
