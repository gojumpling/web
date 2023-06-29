package com.code.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("GoodsPic")
public class GoodsPic implements Serializable {

    @TableField("Goods_id")
    private Integer goodsId;

    @TableField("url")
    private String url;


}
