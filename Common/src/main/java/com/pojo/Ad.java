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
@TableName("AD")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AD_id", type = IdType.AUTO)
    private Integer adId;

    @TableField("AD_uid")
    private Integer adUid;

    @TableField("AD_title")
    private String adTitle;

    @TableField("AD_content")
    private String adContent;

    @TableField("AD_hits")
    private Integer adHits;

    @TableField("AD_startTime")
    private Date adStarttime;

    @TableField("AD_endTime")
    private Date adEndtime;

    @TableField("AD_status")
    private String adStatus;

    @TableField("AD_date")
    private Date adDate;


}
