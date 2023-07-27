package com.mys.zkty.service.serviceImp;

import com.mys.zkty.dao.RegistDao;
import com.mys.zkty.pojo.User;
import com.mys.zkty.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistServiceImp implements RegistService {
    @Autowired
    RegistDao registDao;
    @Override
    public int regist(User user) {
        return registDao.regist(user);
    }

    @Override
    public User  usernameIsNull(String username) {
        return registDao.usernameIsNull(username);
    }
}
