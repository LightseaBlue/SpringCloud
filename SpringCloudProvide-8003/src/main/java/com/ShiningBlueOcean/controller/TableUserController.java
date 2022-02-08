package com.ShiningBlueOcean.controller;


import com.ShiningBlueOcean.entity.TableUser;
import com.ShiningBlueOcean.service.TableUserService;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Spring-Cloud项目测试(TableUser)表控制层
 *
 * @author makejava
 * @since 2021-09-03 11:05:01
 */
@RestController
@RequestMapping("tableUser")
public class TableUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TableUserService tableUserService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tableUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TableUser> page, TableUser tableUser) {
        return success(tableUserService.list());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tableUserService.getById(id));
    }

}