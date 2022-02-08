package com.ShiningBlueOcean.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ShiningBlueOcean.entity.TableUser;
import com.ShiningBlueOcean.service.TableUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

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
    @HystrixCommand(fallbackMethod = "selectAllBack1")
    @GetMapping
    public R selectAll(Page<TableUser> page, TableUser tableUser) {
        List<TableUser> list = tableUserService.list();
        if(list==null){
            throw new RuntimeException();
        }
        return success(list);
    }

    public R selectAllBack1(Page<TableUser> page, TableUser tableUser){
        return success(TableUser.builder().uAddress("qinghai").build());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @HystrixCommand(fallbackMethod = "selectAllBack")
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        TableUser byId = tableUserService.getById(id);
        if(byId==null){
            throw new RuntimeException();
        }
        return success(byId);
    }

    public R selectAllBack(@PathVariable Serializable id){
        return success(TableUser.builder().uAddress("qinghai").build());
    }

}