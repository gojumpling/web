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
@TableName("Orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Orders_id", type = IdType.INPUT)
    private Integer ordersId;

    @TableField("Goods_id")
    private Integer goodsId;

    @TableField("User_id")
        private Integer userId;

    @TableField("Orders_state")
    private String ordersState;

    @TableField("Orders_date")
    private Date ordersDate;

    @TableField("Orders_payment")
    private Float ordersPayment;


}
