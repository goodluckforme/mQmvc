package com.xiaomakeji.mvcmq.service;

import com.xiaomakeji.mvcmq.entity.TestEntity;

import org.hswebframework.web.service.CrudService;

public interface TestService extends CrudService<TestEntity, String> {
    TestEntity getUserById_(Integer id);
}
