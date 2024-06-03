package com.atguigu.enum0;

/**
 * 枚举：成员变量都是静态常量
 */
public enum State0 {
    //等价于->   State0 ENUM=new State0("书")
    ENUM0("书"),

    ENUM1("笔");

    private String name;

    State0() {      // 默认private
    }

    State0(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
