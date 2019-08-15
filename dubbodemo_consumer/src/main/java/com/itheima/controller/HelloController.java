package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.api.service.HelloService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class);
    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name){
        logger.error("测试日志");
        return helloService.sayHello(name);
    }
}
