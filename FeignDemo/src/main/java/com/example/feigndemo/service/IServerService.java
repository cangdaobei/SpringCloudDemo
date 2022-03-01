package com.example.feigndemo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("serviceB1")
public interface IServerService {
    @RequestMapping(value = "/user/saveUser/{name}/{age}/{sex}", method = RequestMethod.POST, consumes = "application/json")
    String saveUser(@PathVariable(value = "name") String name, @PathVariable(value = "age") String age , @PathVariable(value = "sex") String sex );
}
