package com.ShiningBlueOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: SpringCloudConsumer
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/3     15:43
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
//加载到Feign服务提供类
@EnableFeignClients(basePackages = {"com.ShiningBlueOcean.Feign"})
public class SpringCloudConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerFeign.class,args);
    }
}
