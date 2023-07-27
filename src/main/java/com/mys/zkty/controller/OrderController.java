package com.mys.zkty.controller;

import com.mys.zkty.pojo.SelectOrder;
import com.mys.zkty.pojo.UserAndOrder;
import com.mys.zkty.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("selectAll")
    public List<UserAndOrder> selectAll(){
        List<UserAndOrder> userAndOrders = orderService.selectAll();
        return userAndOrders;
    }
    @RequestMapping("selectByAccTimeAmount")
    public List<UserAndOrder> selectByAccTimeAmount(@RequestBody SelectOrder selectOrder){
        System.out.println(selectOrder);

        List<UserAndOrder> userAndOrders = orderService.selectByAccTimeAmount(selectOrder);

        return userAndOrders;
    }
}
