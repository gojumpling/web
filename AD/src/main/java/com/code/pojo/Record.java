package com.code.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Record")
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Record_id", type = IdType.INPUT)
    private Integer recordId;

    @TableField("User_id")
    private Integer userId;

    @TableField("AD_id")
    private Integer adId;

    @TableField("Record_date")
    private Date recordDate;

    @TableField("Record_state")
    private String recordState;


}
