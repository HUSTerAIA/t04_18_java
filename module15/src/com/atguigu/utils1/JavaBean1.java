package com.atguigu.utils1;

public class JavaBean1 {
    /*
    定义标准javabean
     */
    private Integer uid;        // 包装类
    private String name;        // 引用数据类型

    public JavaBean1() {

    }
    public JavaBean1(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
