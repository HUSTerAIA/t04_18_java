package com.atguigu.abstract3;

public class Andriod extends Developer{
    @Override
    public void work() {
        System.out.println(getId()+"员工"+this.getName()+"安卓开发");
    }
}
