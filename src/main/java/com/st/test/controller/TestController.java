package com.st.test.controller;

import com.st.test.pojo.Test;
import com.st.test.service.TestService;
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
