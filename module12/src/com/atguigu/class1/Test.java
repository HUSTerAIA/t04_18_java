package com.atguigu.class1;

public class Test {
    public static void main(String[] args) {
        //接口类型作为方法参数
        Mouse m=new Mouse();    //new接口的实现类对象
        method(m);

        //接口类型作为返回值
        USB usb=method();   //USB usn=new Mouse()->多态
    }
/*
接口作为方法参数传递，传递实参时，实参为实现类对象
 */
    public static void method(USB usb){     //USB usb=new Mouse()->多态
        usb.open();
    }
/*
接口作为返回值类型返回，返回的是实现类对象
 */
    public static USB method(){
        return new Mouse();
    }
}
