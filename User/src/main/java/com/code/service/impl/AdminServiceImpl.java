package com.code.service.impl;

import com.code.pojo.Admin;
import com.code.mapper.AdminMapper;
import com.code.service.AdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
