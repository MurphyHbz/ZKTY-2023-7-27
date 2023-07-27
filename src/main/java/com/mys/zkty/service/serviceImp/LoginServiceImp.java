package com.mys.zkty.service.serviceImp;

import com.mys.zkty.dao.LoginDao;
import com.mys.zkty.pojo.User;
import com.mys.zkty.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    LoginDao loginDao;
    @Override
    public User login(String username, String password) {
        return loginDao.login(username, password);
    }
}
