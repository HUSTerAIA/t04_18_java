package com.atguigu.interface1;

public class Test {
    public static void main(String[] args) {
        Mouse m=new Mouse();
        m.open();
        String result=m.close("关闭鼠标");
        System.out.println(result);

        m.method1();

        USB.method2();  //直接调用

    }
}
