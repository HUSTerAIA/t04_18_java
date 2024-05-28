package com.atguigu.inner_class_no;

public class Test1 {
    public static void main(String[] args) {
        USB usb=method();   //匿名内部类作为返回值，创建实现类对象
        usb.open();
    }

    public static USB method(){
        return new USB(){       // 创建实现类实现接口
            //重写方法
            @Override
            public void open() {
                System.out.println("打开USB");
            }
        };
    }
}
