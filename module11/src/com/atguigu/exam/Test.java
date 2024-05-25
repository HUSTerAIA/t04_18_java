package com.atguigu.exam;

public class Test {
    public static void main(String[] args) {
        Computer c=new Computer();
        Mouse mouse=new Mouse();
        c.start();
        c.useUSB(mouse);        //多态,向上转型
        c.stop();
    }
}
