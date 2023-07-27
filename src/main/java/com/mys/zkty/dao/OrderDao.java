package com.mys.zkty.dao;

import com.mys.zkty.pojo.SelectOrder;
import com.mys.zkty.pojo.UserAndOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderDao {

    List<UserAndOrder> selectAll();

    List<UserAndOrder> selectByAccTimeAmount(SelectOrder selectOrder);
}
