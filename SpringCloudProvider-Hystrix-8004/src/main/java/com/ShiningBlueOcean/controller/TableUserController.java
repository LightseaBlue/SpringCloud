package com.ShiningBlueOcean.controller;


import com.ShiningBlueOcean.Feign.FeignService;
import com.ShiningBlueOcean.entity.TableUser;
import com.ShiningBlueOcean.service.TableUserService;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
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
 * @since 2021-09-03 15:46:53
 */
@RestController
@RequestMapping("tableUser")
public class TableUserController extends ApiController {

    @Resource
    private TableUserService tableUserService;

    @GetMapping
    public R selectAll() {
        return success(tableUserService.list());
    }


    @GetMapping("{id}")
    //说明 发生熔断时  备选方案
    @HystrixCommand(fallbackMethod = "selectAllBack")
    public R selectOne(@PathVariable Serializable id) {
        TableUser byId = tableUserService.getById(id);
        if (byId == null) {
            throw new RuntimeException("id->"+id+"查找错误");
        }

        return success(byId);
    }
    /**
     *发生熔断的解决方案
     * 1. 注意入参要相同
     * 2. 返回类型要相同
     */
    public R selectAllBack(@PathVariable Serializable id){
        return success(TableUser.builder().uAddress("qinghai").build());
    }

}