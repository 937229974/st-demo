package com.st.comment;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;
import org.springframework.context.annotation.Bean;


public enum ResponseModel {
    RESPONSE_FAIL(400,"失败"),RESPONSE_SUCCESS(200,"成功"), RESPONSE_AUTH(403,"权限不足");
    private int code;
    private String msg;

    private ResponseModel(int code,String msg) {
        this.code =code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

//    public static void main(String[] args) {
//        String s = Integer.toString(RESPONSE_FAIL.code);
//        String msg = RESPONSE_FAIL.msg;
//        System.out.println(s);
//        System.out.printf(msg);
//    }

}

