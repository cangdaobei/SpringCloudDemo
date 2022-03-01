package com.example.serverdemo2.controller;

import com.example.serverdemo2.api.ServerApiReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ComputeController {
    private final Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @RequestMapping(value = "/saveUser/{name}/{age}/{sex}" ,method = RequestMethod.POST)
    public String add(@PathVariable(value = "name") String name, @PathVariable(value = "age") String age , @PathVariable(value = "sex") String sex ) {
        logger.info("/saveUser 2, userName:" + name + ", userAge:" + age+ ", userSex:" + sex);
        return "From Service-A, Result is Success";
    }
}