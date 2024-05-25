package com.atguigu.interface1;

public class Mouse implements USB{  // 实现接口
    public void open(){
        System.out.println("打开鼠标");     // 类似继承，必须重写抽象方法

    }

    @Override
    public String close(String msg){        // 重写接口类方法，类似继承
        return msg;
    }

    public void method1(){
        System.out.println("重写接口默认方法");
    }
}
