package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.mapper.GoodsPicMapper;
import com.code.pojo.GoodsPic;
import com.code.service.GoodsPicService;
import org.springframework.stereotype.Service;

@Service
public class GoodsPicImpl extends ServiceImpl<GoodsPicMapper, GoodsPic> implements GoodsPicService {
}
