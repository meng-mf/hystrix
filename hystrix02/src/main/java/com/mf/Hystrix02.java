package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hystrix02
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@SpringBootApplication
@RestController
public class Hystrix02 {
    public static void main(String[] args){

        SpringApplication.run(Hystrix02.class,args);

    }

    @RequestMapping("hystrix03")
    public String hystrix03(){
        System.out.println("--------hystrix03---------");
        return "histrix03";
    }
}
