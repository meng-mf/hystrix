package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hystrix01
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@SpringBootApplication
@RestController
@EnableFeignClients
@EnableCircuitBreaker
public class Hystrix01 {
    public static void main(String[] args){

        SpringApplication.run(Hystrix01.class,args);

    }

    @RequestMapping("test1")
    public String hystrix01(){
        System.out.println("------test1---------");
        return "test1-ok";
    }
}
