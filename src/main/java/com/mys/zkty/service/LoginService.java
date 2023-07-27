package com.mys.zkty.service;

import com.mys.zkty.pojo.User;

public interface LoginService {

    User login(String username, String password);
}
