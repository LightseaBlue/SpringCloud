package com.ShiningBlueOcean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: SpringCloudProvide8001
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/3     11:02
 */
@SpringBootApplication
@MapperScan("com.ShiningBlueOcean.dao")
public class SpringCloudProvide8002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvide8002.class,args);
    }
}
