package com.atguigu.enum0;

public enum State0 {
    //等价于->   State0 ENUM=new State0("书")
    ENUM0("书"),

    ENUM1("笔");

    private String name;

    State0() {
    }

    State0(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
