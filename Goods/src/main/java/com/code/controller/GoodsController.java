package com.code.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.code.pojo.Goods;
import com.code.pojo.GoodsPic;
import com.code.service.GoodsPicService;
import com.code.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class GoodsController {

    @Autowired
    private GoodsPicService goodsPicService;

    @Resource
    GoodsService goodsService;

    @RequestMapping(value = "/Goods/All",method = RequestMethod.GET)
    public List<Goods> AllGoods(@RequestParam(value = "GoodsName") String name){
        return goodsService.listAll(name);

    }

    @RequestMapping(value = "/Goods",method = RequestMethod.POST)
    public Goods addGoods(@RequestBody Goods goods){

        goods.setGoodsId(goodsService.getGoodsID()+1);
        goods.setGoodsDate(new Date());
        if(goodsService.save(goods)){
            return goods;
        }
        return null;
    }

    @RequestMapping(value = "/Goods/img",method = RequestMethod.POST)
    public boolean addGoodsPic(@RequestBody GoodsPic goodsPic){
        return goodsPicService.save(goodsPic);
    }

    @RequestMapping(value = "/Goods/img",method = RequestMethod.GET)
    public List<GoodsPic> addGoodsPic(@RequestParam int id){
        return goodsPicService.list(new QueryWrapper<GoodsPic>().eq("Goods_id",id));
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

