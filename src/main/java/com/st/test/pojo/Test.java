package com.st.test.pojo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Test {
    private  Long id;
    private  String uname;
    private  String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
