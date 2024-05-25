package com.atguigu.interface1;

public class Test {
    public static void main(String[] args) {
        Mouse m=new Mouse();
        m.open();       // 调用重写方法
        String result=m.close("关闭鼠标");      // 调用重写方法
        System.out.println(result);

        m.method1();        // 调用重写方法

        USB.method2();  //直接调用，静态对象

    }
}
