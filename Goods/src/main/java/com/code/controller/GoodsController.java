package com.code.controller;


import com.code.pojo.Goods;
import com.code.service.GoodsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
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
public class GoodsController {

    @Resource
    GoodsService goodsService;

    @RequestMapping(value = "/Goods/All",method = RequestMethod.GET)
    public List<Goods> AllGoods(@RequestParam(value = "GoodsName") String name){
        System.out.println("6666\n==========================="+name);
        return goodsService.listAll(name);

    }

    @RequestMapping(value = "/Goods",method = RequestMethod.POST)
    public Boolean addGoods(@RequestBody Goods goods){

        goods.setGoodsId(goodsService.getGoodsID()+1);
        goods.setGoodsDate(new Date());
        return goodsService.save(goods);

    }


    @RequestMapping(value = "/Goods",method = RequestMethod.PUT)
    public Boolean updateGoods(@RequestBody Goods goods){

        return goodsService.saveOrUpdate(goods);

    }


    @RequestMapping(value = "/Goods",method = RequestMethod.GET)
    public Goods getGoodsByID(@RequestParam(value = "Goods_id") int id){

        return goodsService.getGoodsByID(id);

    }

    @RequestMapping(value = "/Goods",method = RequestMethod.DELETE)
    public Boolean deleteGoods(@RequestParam(value = "Goods_id") int id){

        return goodsService.deleteGoods(id);
    }


    @RequestMapping(value = "/Goods/getUserGoods",method = RequestMethod.POST)
    public List<Goods> getUserGoods(@RequestParam(value = "User_id") int id){

        return goodsService.getUserGoods(id);

    }





}

