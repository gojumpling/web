package com.code.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.code.pojo.Goods;
import com.code.mapper.GoodsMapper;
import com.code.service.GoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Override
    public int getGoodsID() {
        LambdaQueryWrapper<Goods> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(Goods::getGoodsId);
        return this.list(lambdaQueryWrapper).get(0).getGoodsId();
    }

    @Override
    public Goods getGoodsByID(int id) {
        LambdaQueryWrapper<Goods> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Goods::getGoodsId,id);
        return this.getOne(lambdaQueryWrapper);
    }

    @Override
    public Boolean deleteGoods(int id) {

        LambdaQueryWrapper<Goods> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Goods::getGoodsId,id);
        return remove(lambdaQueryWrapper);
    }

    @Override
    public List<Goods> getUserGoods(int id) {
        LambdaQueryWrapper<Goods> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Goods::getUserId,id);
        return this.list(lambdaQueryWrapper);
    }
}
