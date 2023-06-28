package com.code.service;

import com.code.pojo.House;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
public interface HouseService extends IService<House> {


    boolean addHouse(House house);


    public int getHouseID();


    House getHouseByID(int id);

    Boolean deleteHouse(int id);

    List<House> getUserHouse(int id);

    List<House> searchHouse(String s);


}
