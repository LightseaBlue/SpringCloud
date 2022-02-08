package com.ShiningBlueOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: SpringCloudEureka7001
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/3     14:26
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka7002.class,args);
    }
}
