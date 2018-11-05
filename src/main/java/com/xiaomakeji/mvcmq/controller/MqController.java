package com.xiaomakeji.mvcmq.controller;

import com.xiaomakeji.mvcmq.dao.TestDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mq")
public class MqController {
    @Autowired
    private TestDao genSchemeDao;

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    public String test(String page, int num) {
        return "{\"name\":\"nice\"}";
    }
}
