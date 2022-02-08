package com.ShiningBlueOcean;

//import com.RibbonConfig.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName: SpringCloudConsumer
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/3     15:43
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
//这里的Value为实例名    一个实例  配置一个均很策略
//@RibbonClient(value = "SPRINGCLOUDPROVIDE",configuration = MyRule.class)
public class SpringCloudConsumerRibbon {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerRibbon.class,args);
    }
}
