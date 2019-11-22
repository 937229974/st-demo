package com.demo.test.controller;

import com.demo.test.pojo.Test;
import com.demo.test.service.TestService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test" ,method = RequestMethod.POST)
    public Map<String,String> test(){
        String id ="1";
        Test test = testService.queryInfo(id);
        System.out.println(test.getUname());
        Map map = new HashMap();
        map.put("test","test");
        map.put("2","02");

        return map;

    }
}
