package com.ShiningBlueOcean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

/**
 * Spring-Cloud项目测试(TableUser)表实体类
 *
 * @author makejava
 * @since 2021-09-03 10:54:25
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("table_user")
public class TableUser extends Model<TableUser> implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "u_name")
    private String uName;

    @TableField(value = "u_sex")
    private Integer uSex;

    @TableField(value = "u_phone")
    private String uPhone;

    @TableField(value = "u_address")
    private String uAddress;
}