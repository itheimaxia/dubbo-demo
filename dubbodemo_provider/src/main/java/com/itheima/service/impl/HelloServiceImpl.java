package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.api.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "8083 hello " + name;
    }
}
