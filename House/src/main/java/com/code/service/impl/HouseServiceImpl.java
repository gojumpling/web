package com.code.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.code.pojo.House;
import com.code.mapper.HouseMapper;
import com.code.service.HouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {

    @Override
    public boolean addHouse(House house) {

        return this.save(house);
    }

    @Override
    public int getHouseID() {

        LambdaQueryWrapper<House> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(House::getHouseId);
        return this.list(lambdaQueryWrapper).get(0).getHouseId();

    }

    @Override
    public House getHouseByID(int id) {
        LambdaQueryWrapper<House> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(House::getHouseId,id);
        return this.getOne(lambdaQueryWrapper);
    }

    @Override
    public Boolean deleteHouse(int id) {
        LambdaQueryWrapper<House> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(House::getHouseId,id);
        return this.remove(lambdaQueryWrapper);
    }

    @Override
    public List<House> getUserHouse(int id) {
        LambdaQueryWrapper<House> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(House::getUserId,id);
        return this.list(lambdaQueryWrapper);
    }

    @Override
    public List<House> searchHouse(String s) {
        LambdaQueryWrapper<House> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper
                .like(House::getHouseAddress,s).or()
                .like(House::getHouseNotes,s).or()
                .like(House::getHouseType,s);
        return this.list(lambdaQueryWrapper);
    }
}
