package com.ShiningBlueOcean.Feign;

import com.ShiningBlueOcean.entity.TableUser;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: FeignControll
 * @Package: com.ShiningBlueOcean.Feign
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/4     19:24
 */
@FeignClient(value = "SPRINGCLOUDPROVIDE",fallbackFactory = FeignExceptionBack.class)
public interface FeignService {
    /**
     * 注意
     * 1. 需与服务名    接口名   相同
     * 2. 访问路径相同
     * 3. 返回值相同
     */
    @GetMapping("tableUser")
    public R selectAll(Page<TableUser> page, TableUser tableUser);

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("tableUser/{id}")
    public R selectOne(@PathVariable("id") Serializable id);
}
