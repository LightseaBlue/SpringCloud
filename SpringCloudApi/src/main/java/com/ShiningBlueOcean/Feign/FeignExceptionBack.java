package com.ShiningBlueOcean.Feign;

import com.ShiningBlueOcean.entity.TableUser;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName: FeignExceptionBack
 * @Package: com.ShiningBlueOcean.Feign
 * @Description: 服务降级
 * @author: LightseaBlue
 * @date: 2021/9/6     21:02
 */
@Component
public class FeignExceptionBack extends ApiController implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new FeignService() {
            @Override
            public R selectAll(Page<TableUser> page, TableUser tableUser) {
                return failed("selectAll->本服务已关闭");
            }

            @Override
            public R selectOne(Serializable id) {
                return failed("selectOne->本服务已关闭");
            }
        };
    }
}
