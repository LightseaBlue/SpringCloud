package com.ShiningBlueOcean.dao;

import com.ShiningBlueOcean.entity.TableUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * Spring-Cloud项目测试(TableUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-03 11:04:58
 */
@Repository
public interface TableUserDao extends BaseMapper<TableUser> {

}