package com.mys.zkty.dao;

import com.mys.zkty.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegistDao {
    int regist(User user);
    User usernameIsNull(@Param("username") String username);
}

