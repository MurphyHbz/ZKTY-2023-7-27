package com.mys.zkty.service.serviceImp;

import com.mys.zkty.dao.OrderDao;
import com.mys.zkty.pojo.SelectOrder;
import com.mys.zkty.pojo.UserAndOrder;
import com.mys.zkty.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderDao orderDao;
    @Override
    public List<UserAndOrder> selectAll() {
        return orderDao.selectAll();
    }

    @Override
    public List<UserAndOrder> selectByAccTimeAmount(SelectOrder selectOrder) {
        return orderDao.selectByAccTimeAmount(selectOrder);
    }
}
