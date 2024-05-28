package com.atguigu.class1;

public class Mouse implements USB{      // 实现接口
    @Override   //重写接口抽象类
    public void open(){
        System.out.println("打开鼠标");
    }
}
