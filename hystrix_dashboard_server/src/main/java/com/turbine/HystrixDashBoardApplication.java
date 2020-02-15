package com.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
//添加断路器支持
@EnableHystrix
//添加hystrix的可视化监控面板
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class HystrixDashBoardApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixDashBoardApplication.class,args);
    }
}
