package com.pojo;

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
 * @since 2023-06-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Worker")
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Worker_id", type = IdType.AUTO)
    private Integer workerId;

    @TableField("Worker_uid")
    private Integer workerUid;

    @TableField("Worker_name")
    private String workerName;

    @TableField("Worker_content")
    private String workerContent;

    @TableField("Worker_type")
    private String workerType;

    @TableField("Worker_address")
    private String workerAddress;

    @TableField("Worker_salary")
    private String workerSalary;

    @TableField("Worker_state")
    private String workerState;

    @TableField("Worker_notes")
    private String workerNotes;

    @TableField("Worker_date")
    private Date workerDate;


}
