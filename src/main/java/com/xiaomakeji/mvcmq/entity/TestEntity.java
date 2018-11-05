package com.xiaomakeji.mvcmq.entity;

import org.hswebframework.web.commons.entity.SimpleGenericEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestEntity extends SimpleGenericEntity<String> {
    private String name;

    private Byte status;

    private String comment;

    public TestEntity(String name) {
        this.name = name;
    }

    public TestEntity() {
    }
}
