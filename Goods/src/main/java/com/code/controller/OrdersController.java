package com.code.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.code.pojo.Orders;
import com.code.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
@CrossOrigin
@RestController
public class OrdersController {

    @Resource
    OrdersService ordersService;



    @RequestMapping(value = "/Order",method = RequestMethod.POST)
    public Orders addOrder(@RequestBody Orders orders){

        orders.setOrdersId(ordersService.getOrderID()+1);
        orders.setOrdersDate(new Date());

        if(ordersService.save(orders)){
            return orders;
        }
        return null;
    }

    @RequestMapping(value = "/Order/user",method = RequestMethod.GET)
    public List<Orders> getOrderByUserId(@RequestParam("User_id") int id){
        return ordersService.list(new QueryWrapper<Orders>().eq("User_id",id));
    }

    @RequestMapping(value = "/Order",method = RequestMethod.GET)
    public Orders getOrder(@RequestParam("Order_id") int id){
        return ordersService.getById(id);
    }


    @RequestMapping(value = "/Order",method = RequestMethod.DELETE)
    public Boolean deleteOrder(@RequestParam("Order_id") int id){

        return ordersService.deleteOrder(id);

    }

    @RequestMapping(value = "/Order",method = RequestMethod.PUT)
    public Boolean updateOrder(@RequestBody Orders orders){

        return ordersService.saveOrUpdate(orders);

    }






}

