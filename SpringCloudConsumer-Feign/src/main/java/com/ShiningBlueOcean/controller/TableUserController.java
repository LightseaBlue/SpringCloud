package com.ShiningBlueOcean.controller;


import com.ShiningBlueOcean.Feign.FeignService;
import com.ShiningBlueOcean.entity.TableUser;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Spring-Cloud项目测试(TableUser)表控制层
 *
 * @author makejava
 * @since 2021-09-03 15:46:53
 */
@RestController
@RequestMapping("tableUser")
public class TableUserController extends ApiController {
    @Resource
    private FeignService feignController;


    @GetMapping
    public R selectAll(Page<TableUser> page, TableUser tableUser) {
             return feignController.selectAll(page,tableUser);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return feignController.selectOne(id);
    }



}