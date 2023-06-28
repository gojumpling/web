package com.code.service.impl;

import com.code.pojo.Ad;
import com.code.mapper.AdMapper;
import com.code.service.AdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
