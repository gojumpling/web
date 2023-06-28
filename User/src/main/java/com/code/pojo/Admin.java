package com.code.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("Admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Admin_id", type = IdType.AUTO)
    private Integer adminId;

    @TableField("Admin_account")
    private String adminAccount;

    @TableField("Admin_pwd")
    private String adminPwd;


}
