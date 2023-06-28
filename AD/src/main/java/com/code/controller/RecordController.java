package com.code.controller;


import com.code.pojo.Ad;
import com.code.pojo.Record;
import com.code.service.AdService;
import com.code.service.RecordService;
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
public class RecordController {


    @Resource
    RecordService recordService;


    @RequestMapping(value = "/Record",method = RequestMethod.POST)
    public Boolean addRecord(@RequestBody Record record){

        record.setRecordId(recordService.getRecordID()+1);
        record.setRecordDate(new Date());
        return recordService.save(record);

    }


    @RequestMapping(value = "/Record",method = RequestMethod.GET)
    public Record getRecordByID(@RequestParam("Record_id") int id){
        return recordService.getById(id);
    }


    @RequestMapping(value = "/Record/getAllRecord",method = RequestMethod.GET)
    public List<Record> getAllRecord(){
        return recordService.list(null);
    }





}

