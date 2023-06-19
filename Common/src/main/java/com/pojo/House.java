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
@TableName("House")
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "House_id", type = IdType.AUTO)
    private Integer houseId;

    @TableField("House_uid")
    private Integer houseUid;

    @TableField("House_address")
    private String houseAddress;

    @TableField("House_area")
    private String houseArea;

    @TableField("House_level")
    private String houseLevel;

    @TableField("House_rent")
    private Float houseRent;

    @TableField("House_type")
    private String houseType;

    @TableField("House_state")
    private String houseState;

    @TableField("House_notes")
    private String houseNotes;

    @TableField("House_date")
    private Date houseDate;


}
