package com.mys.zkty.controller;

import com.mys.zkty.pojo.User;
import com.mys.zkty.pojo.uitl.UuidUtil;
import com.mys.zkty.service.LoginService;
import com.mys.zkty.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class RegistController {
    @Autowired
    RegistService registService;
    @Autowired
    UuidUtil uuidUtil;
    @RequestMapping(value = "/regist",method = RequestMethod.POST,consumes = "application/json;charset=UTF-8")
    public String regist(@RequestBody User user){
        user.setUserId(uuidUtil.getShortUuid());
        boolean aNull = isNull(user.getUsername());
        if (aNull){
            int i = registService.regist(user);
            if (i>0){
                return"success";
            }
        }
        return "error";
    }
    public boolean isNull(String username){
        User user = registService.usernameIsNull(username);
        if (user!=null){
            return false;
        }
        return true;
    }


}
