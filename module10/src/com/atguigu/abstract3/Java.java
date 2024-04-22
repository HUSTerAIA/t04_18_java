package com.atguigu.abstract3;

public class Java extends Developer{
    public void work(){
        System.out.println("java开发");
    }

    public Java() {
    }

    public Java(int id, String name) {
        super(id, name);
    }
}
