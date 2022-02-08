package com.ShiningBlueOcean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: SpringCloudHysrtix
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/5     22:00
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//支持熔断机制
@EnableCircuitBreaker
@MapperScan("com.ShiningBlueOcean.dao")
public class SpringCloudHystrix {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrix.class,args);
    }
}
