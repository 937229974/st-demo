package com.st.test.service;


import com.st.test.dao.TestDao;
import com.st.test.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public Test queryInfo(String id){
        System.out.println(id);
        Test test = testDao.queryInfo(id);
        return test;
    };
}
