package com.mys.zkty.service;

import com.mys.zkty.pojo.SelectOrder;
import com.mys.zkty.pojo.UserAndOrder;

import java.util.List;

public interface OrderService {

    List<UserAndOrder> selectAll();
    List<UserAndOrder> selectByAccTimeAmount(SelectOrder selectOrder);
}
