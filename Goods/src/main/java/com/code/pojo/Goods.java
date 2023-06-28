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
@TableName("Goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Goods_id", type = IdType.AUTO)
    private Integer goodsId;

    @TableField("User_id")
    private Integer userId;

    @TableField("Goods_name")
    private String goodsName;

    @TableField("Goods_type")
    private String goodsType;

    @TableField("Goods_price")
    private Float goodsPrice;

    @TableField("Goods_date")
    private Date goodsDate;

    @TableField("Goods_state")
    private String goodsState;

    @TableField("Goods_notes")
    private String goodsNotes;


}
