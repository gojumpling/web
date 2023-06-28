package com.code.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.code.pojo.Ad;
import com.code.mapper.AdMapper;
import com.code.service.AdService;
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
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements AdService {

    @Override
    public int getADID() {
        LambdaQueryWrapper<Ad> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(Ad::getAdId);
        return this.list(lambdaQueryWrapper).get(0).getAdId();
    }

    @Override
    public Boolean deleteAD(int id) {
        LambdaQueryWrapper<Ad> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Ad::getAdId,id);

        return this.remove(lambdaQueryWrapper);
    }

    @Override
    public List<Ad> getUserAD(int id) {
        LambdaQueryWrapper<Ad> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Ad::getUserId,id);

        return this.list(lambdaQueryWrapper);
    }
}
