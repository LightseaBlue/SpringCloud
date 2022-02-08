package com.ShiningBlueOcean.service.impl;

import com.ShiningBlueOcean.dao.TableUserDao;
import com.ShiningBlueOcean.entity.TableUser;
import com.ShiningBlueOcean.service.TableUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Spring-Cloud项目测试(TableUser)表服务实现类
 *
 * @author makejava
 * @since 2021-09-03 11:05:01
 */
@Service("tableUserService")
public class TableUserServiceImpl extends ServiceImpl<TableUserDao, TableUser> implements TableUserService {

}