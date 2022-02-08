package com.ShiningBlueOcean.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.ShiningBlueOcean.entity.TableUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    public static final String PREFIX = "http://SPRINGCLOUDPROVIDE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<R> selectAll() {
             return restTemplate.getForEntity(PREFIX+"/tableUser",R.class);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(
                restTemplate.getForEntity(PREFIX+"/tableUser/"+id,R.class)
        );
    }

}