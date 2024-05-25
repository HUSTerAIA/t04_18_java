package com.atguigu.abstract3;

public class Java extends Developer{
    // 继承developer
    public void work(){
        // 继承，重写抽象方法
        System.out.println("java开发");
    }

    public Java() {
    }

    public Java(int id, String name) {
        super(id, name);        //调用父类有参构造
    }
}
