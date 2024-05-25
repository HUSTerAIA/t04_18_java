package com.atguigu.abstract3;

public class Andriod extends Developer{
    // 继承developer
    @Override
    public void work() {
        // 继承，重写抽象方法
        System.out.println(getId()+"员工"+this.getName()+"安卓开发");
    }
}
