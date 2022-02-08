package com.ShiningBlueOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: HystrixMonitor_9001
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/7     20:32
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixMonitor9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMonitor9001.class,args);
    }
}
