package com.code.controller;


import com.code.pojo.Contract;
import com.code.pojo.House;
import com.code.service.ContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
@RestController

public class ContractController {

    @Resource
    ContractService contractService;

    @RequestMapping(value = "/Contract",method = RequestMethod.POST)
    public Boolean addContract(@RequestBody Contract contract){
        contract.setContractId(contractService.getContractID()+1);
//        contract.setContractDate(new Date());

        contract.setContractDate(new Date());

        return contractService.save(contract);
    }

    @RequestMapping(value = "/Contract",method = RequestMethod.GET)
    public List<Contract> getContractByID(@RequestParam(value = "User_id") int id){

        return contractService.getContractByID(id);

    }





}

