package com.mf.web;

import com.mf.api.HystrixApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hystrix01Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@RestController
public class Hystrix01Controller {
    @Autowired
    private HystrixApi hystrixApi;

    @RequestMapping("hystrix02/{name}")
    @HystrixCommand(fallbackMethod = "hystrixBack")
    public String hystrix02(@PathVariable String name){
        System.out.println("-----------name----------"+name);
        return hystrixApi.hystrix01(name);
    }

    public String hystrixBack(String name){
        return "出错了 参数-->"+name;
    }
}
