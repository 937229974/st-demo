package com.demo.test.dao;

import com.demo.test.pojo.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {
    /*
    * 数据查询方法
    * */
    Test queryInfo(String id);
}
