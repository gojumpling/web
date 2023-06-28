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
@TableName("Contract")
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Contract_id", type = IdType.AUTO)
    private Integer contractId;

    @TableField("User_id")
    private Integer userId;

    @TableField("House_id")
    private Integer houseId;

    @TableField("Contract_date")
    private Date contractDate;

    @TableField("Contract_term")
    private String contractTerm;

    @TableField("Contract_state")
    private String contractState;


}
