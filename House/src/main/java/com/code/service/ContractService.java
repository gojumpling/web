package com.code.service;

import com.code.pojo.Contract;
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
public interface ContractService extends IService<Contract> {

    int getContractID();

    List<Contract> getContractByID(int id);

}
