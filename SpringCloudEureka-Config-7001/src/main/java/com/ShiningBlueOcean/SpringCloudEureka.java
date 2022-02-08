package com.ShiningBlueOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: SpringCloudEureka
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/14     21:39
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka.class,args);
    }
}
