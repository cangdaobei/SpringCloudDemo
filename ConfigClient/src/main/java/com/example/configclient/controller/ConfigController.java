package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configTest")
@RefreshScope
public class ConfigController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/queryConfig" ,method = RequestMethod.GET)
    public String queryConfig() {
        return from;
    }
}