package com.mf.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "hystrix02",fallback = HystrixClass.class)
@FeignClient(name = "hystrix02")
//@Hystrix
public interface HystrixApi {
    @RequestMapping("hystrix01")
    public String hystrix01(@RequestParam("name") String name);
}
