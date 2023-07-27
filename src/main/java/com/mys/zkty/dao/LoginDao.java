package com.mys.zkty.dao;

import com.mys.zkty.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDao {

    User login(@Param("username") String username,@Param("password") String password);
}
