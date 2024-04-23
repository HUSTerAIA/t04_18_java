package com.atguigu.innerclass;

import sun.font.CreatedFontTracker;

public class Test {
    public static void main(String[] args) {
        USB usb=method();   //USB usb=new Mouse()->多态
        usb.open();

    }


    public static USB method(){
        //局部内部类
        class Mouse implements USB{ //接口实现
            //方法重写
            @Override
            public void open(){
                System.out.println("鼠标打开");
            }


        }
        return new Mouse(); //返回接口实现类对象
    }
}
