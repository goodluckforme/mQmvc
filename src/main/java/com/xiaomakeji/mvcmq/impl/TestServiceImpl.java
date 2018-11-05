package com.xiaomakeji.mvcmq.impl;

import com.xiaomakeji.mvcmq.dao.TestDao;
import com.xiaomakeji.mvcmq.entity.TestEntity;
import com.xiaomakeji.mvcmq.service.TestService;

import org.hswebframework.web.dao.CrudDao;
import org.hswebframework.web.id.IDGenerator;
import org.hswebframework.web.service.GenericEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends GenericEntityService<TestEntity, String> implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    protected IDGenerator<String> getIDGenerator() {
        return IDGenerator.MD5;
    }

    @Override
    public CrudDao<TestEntity, String> getDao() {
        return testDao;
    }

    @Override
    public TestEntity getUserById_(Integer id) {
        return null;
    }
}
