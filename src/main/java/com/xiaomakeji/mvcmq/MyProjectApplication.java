package com.xiaomakeji.mvcmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouhao
 * @since 1.0
 */
@MapperScan(basePackages = "com.xiaomakeji.mvcmq.dao", markerInterface = org.hswebframework.web.dao.Dao.class)
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class,args);
    }
}