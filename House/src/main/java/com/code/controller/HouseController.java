package com.code.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.code.pojo.House;
import com.code.pojo.HousePic;
import com.code.service.HousePicService;
import com.code.service.HouseService;
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
@RestController
public class HouseController {

    @Resource
    HouseService houseService;

    @Autowired
    HousePicService housePicService;


    @RequestMapping(value = "/House",method = RequestMethod.POST)
    public House addHouse(@RequestBody House house){

        house.setHouseId(houseService.getHouseID()+1);
        house.setHouseDate(new Date());

        if (houseService.save(house)){
            return house;
        }
        return null;
    }

    @RequestMapping(value = "/House",method = RequestMethod.GET)
    public House getHouse(@RequestParam(value = "House_id") int id){
        return houseService.getHouseByID(id);
    }

    @RequestMapping(value = "/House/img",method = RequestMethod.POST)
    public boolean addHousePic(@RequestBody HousePic housePic){
        return housePicService.save(housePic);
    }

    @RequestMapping(value = "/House/img",method = RequestMethod.GET)
    public List<HousePic> addHousePic(@RequestParam int id){
        return housePicService.list(new QueryWrapper<HousePic>().eq("House_id",id));
    }


    @RequestMapping(value = "/House",method = RequestMethod.PUT)
    public Boolean updateHouse(@RequestBody House house){

        return houseService.saveOrUpdate(house);
    }


    @RequestMapping(value = "/House",method = RequestMethod.DELETE)
    public Boolean deleteHouse(@RequestParam(value = "House_id") int id){

        return houseService.deleteHouse(id);

    }


    /**
     * 获取用户发布的房屋
     * @param id
     * @return
     */
    @RequestMapping(value = "/House/getUserHouse",method = RequestMethod.POST)
    public List<House> getUserHouse(@RequestParam(value = "User_id") int id){
        return houseService.getUserHouse(id);
    }


    @RequestMapping(value = "/House/getAllHouse",method = RequestMethod.GET)
    public List<House> getAllHouse(){
        return houseService.list(null);
    }


    /**
     * 模糊查询，根据备注、类型、地址模糊查询
     * @param search
     * @return
     */
    @RequestMapping(value = "/House/getHouse",method = RequestMethod.GET)
    public List<House> getHouse(@RequestParam(value = "search") String search){

        return houseService.searchHouse(search);

    }







}

