package com.example.feigndemo.controller;

import com.example.feigndemo.api.ServerApiReq;
import com.example.feigndemo.api.ServerApiRes;
import com.example.feigndemo.service.IServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign/test")
public class FeignController {

    //根据 @EnableFeignClients 注册的包路径，扫描所有注解了 @FeignClient 的接口，调用 ImportBeanDefinitionRegistrar#registerFeignClient 将其注册到 Spring 容器中
    @Autowired
    IServerService iServerService;

    @RequestMapping(value = "/saveUser",method = RequestMethod.GET)
    public String saveUser(@RequestParam(value="name")String name,@RequestParam(value="age")String age,@RequestParam(value="sex")String sex){
        String result = iServerService.saveUser(name,age,sex);
        return result;
    }
}
