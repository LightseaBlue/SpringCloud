package com.ShiningBlueOcean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: SpringCloudConfig9527
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/12     20:34
 */
@SpringBootApplication
//开启配置服务   能从远程仓库访问到配置
@EnableConfigServer
public class SpringCloudConfig9527 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig9527.class,args);
    }
}
