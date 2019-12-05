package com.mf.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hystrix02Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@RestController
public class Hystrix02Controller {
    @RequestMapping("hystrix01")
    public String hystrix01(String name){
        System.out.println("----------name--------"+name);
        return "hystrix01-ok";
    }
}
