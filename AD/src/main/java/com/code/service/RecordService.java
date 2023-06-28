package com.code.service;

import com.code.pojo.Record;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
public interface RecordService extends IService<Record> {


    int getRecordID();

}
