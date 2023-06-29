package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.mapper.HousePicMapper;
import com.code.pojo.HousePic;
import com.code.service.HousePicService;
import org.springframework.stereotype.Service;

@Service
public class HousePicImpl extends ServiceImpl<HousePicMapper, HousePic> implements HousePicService {
}
