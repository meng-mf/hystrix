package com.mf.api;

import org.springframework.stereotype.Component;

/**
 * @ClassName HystrixClass
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/5
 * @Version V1.0
 **/
@Component
public class HystrixClass implements HystrixApi{

    @Override
    public String hystrix01(String name) {
        return "出错了————————^_^";
    }
}
