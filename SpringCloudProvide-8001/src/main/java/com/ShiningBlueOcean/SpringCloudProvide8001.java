package com.ShiningBlueOcean;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @ClassName: SpringCloudProvide8001
 * @Package: com.ShiningBlueOcean
 * @Description:
 * @author: LightseaBlue
 * @date: 2021/9/3     11:02
 */
@SpringBootApplication()
@MapperScan("com.ShiningBlueOcean.dao")
@EnableCircuitBreaker
public class SpringCloudProvide8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvide8001.class,args);
    }

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(hystrixMetricsStreamServlet);

        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setUrlMappings(Arrays.asList("/actuator/hystrix.stream"));
        servletRegistrationBean.setName("HystrixMetricsStreamServlet");
        return servletRegistrationBean;
    }

}
