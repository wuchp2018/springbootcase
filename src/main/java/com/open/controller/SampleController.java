package com.open.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@Controller
//@EnableAutoConfiguration
public class SampleController {


//    其中数据库采用的是Mysql，ORM采用的是Spring Data JPA，前端页面采用js+html5。（当然还有其他的方式，例如ORM框架采用mybatis等，本文暂未涉及。）

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
//    }
}
