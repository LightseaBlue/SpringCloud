package com.ShiningBlueOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: Zuul
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/8     22:44
 */
@SpringBootApplication
//开启Zuul代理
@EnableZuulProxy
public class Zuul {
    public static void main(String[] args) {
        SpringApplication.run(Zuul.class,args);
    }
}
