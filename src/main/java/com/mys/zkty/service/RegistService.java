package com.mys.zkty.service;

import com.mys.zkty.pojo.User;
import org.apache.ibatis.annotations.Param;


public interface RegistService {
    int regist(User user);
    User usernameIsNull(@Param("username") String username);
}
