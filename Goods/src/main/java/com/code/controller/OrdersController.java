package com.code.controller;


import com.code.pojo.Goods;
import com.code.pojo.Orders;
import com.code.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

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
    public Boolean addOrder(@RequestBody Orders orders){

        orders.setOrdersId(ordersService.getOrderID()+1);
        orders.setOrdersDate(new Date());

        return ordersService.save(orders);
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

