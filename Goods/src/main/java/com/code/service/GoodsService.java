package com.code.service;

import com.code.pojo.Goods;
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
public interface GoodsService extends IService<Goods> {


    int getGoodsID();

    Goods getGoodsByID(int id);

    Boolean deleteGoods(int id);

    List<Goods> getUserGoods(int id);

}
