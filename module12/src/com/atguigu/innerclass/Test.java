package com.atguigu.innerclass;



public class Test {
    public static void main(String[] args) {
        USB usb=method();   //USB usb=new Mouse()->多态，局部内部类作为方法返回值
        usb.open();

    }


    public static USB method(){
        //局部内部类
        class Mouse implements USB{ //接口实现
            //方法重写,接口和抽象类都要重写抽象方法
            @Override
            public void open(){
                System.out.println("鼠标打开");
            }


        }
        return new Mouse(); //返回接口实现类对象
    }
}
