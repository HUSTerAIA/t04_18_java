package com.atguigu.polymorphic2;

public class Test {
    public static void main(String[] args) {
        //多态，fu>zi
        Fu fu=new Zi();
        System.out.println(fu.num);     //调用成员变量，看new等号左边，fu的num

        fu.method();    //调用成员方法，看等号右边，zi的method

        Zi zi=new Zi();
        System.out.println("zi.name = " + zi.name);

    }
}
