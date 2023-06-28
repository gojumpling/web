package com.code.controller;


import com.code.pojo.Ad;
import com.code.service.AdService;
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
public class AdController {


    @Resource
    AdService adService;


    @RequestMapping(value = "/AD",method = RequestMethod.POST)
    public Boolean addAD(@RequestBody Ad ad){

        ad.setAdId(adService.getADID()+1);
        ad.setAdDate(new Date());
        ad.setAdHits(0);
        return adService.save(ad);

    }


    @RequestMapping(value = "/AD",method = RequestMethod.PUT)
    public Boolean updateGoods(@RequestBody Ad ad){

        return adService.saveOrUpdate(ad);

    }


    @RequestMapping(value = "/AD",method = RequestMethod.GET)
    public Ad getGoodsByID(@RequestParam(value = "AD_id") int id){

        return adService.getById(id);

    }


    @RequestMapping(value = "/AD",method = RequestMethod.DELETE)
    public Boolean deleteGoods(@RequestParam(value = "AD_id") int id){

        return adService.deleteAD(id);
    }


    @RequestMapping(value = "/AD/getUserAD",method = RequestMethod.GET)
    public List<Ad> getUserAD(@RequestParam(value = "User_id") int id){

        return adService.getUserAD(id);

    }

}

