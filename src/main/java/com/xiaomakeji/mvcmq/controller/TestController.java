package com.xiaomakeji.mvcmq.controller;

import com.xiaomakeji.mvcmq.entity.TestEntity;
import com.xiaomakeji.mvcmq.service.TestService;

import org.hswebframework.web.commons.entity.param.QueryParamEntity;
import org.hswebframework.web.controller.SimpleGenericEntityController;
import org.hswebframework.web.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/user")
public class TestController implements SimpleGenericEntityController<TestEntity, String, QueryParamEntity> {
    @Autowired
    private TestService testService;

    @Override
    public CrudService<TestEntity, String> getService() {
        return testService;
    }

    @GetMapping("/get")
    public TestEntity getUserById(Integer id) {
        return new TestEntity();
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public TestEntity getUserById_(Integer id, HttpServletRequest request) throws Exception {
       return testService.getUserById_(id);
    }
}
