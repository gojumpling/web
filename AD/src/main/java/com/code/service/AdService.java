package com.code.service;

import com.code.pojo.Ad;
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
public interface AdService extends IService<Ad> {

    int getADID();
    Boolean deleteAD(int id);

    List<Ad> getUserAD(int id);

}
