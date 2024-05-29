package com.atguigu.utils1;

public class Pack1 {
    public static void main(String[] args) {
        //创建包装类
        Integer num1=new Integer(1);
        System.out.println("num1 = " + num1);

        Integer num2=new Integer("3435");
        System.out.println("num2 = " + num2);

        Boolean b1=new Boolean("tRUe");
        System.out.println("b1 = " + b1);

        Boolean b2=new Boolean("false");
        System.out.println("b2 = " + b2);

        Boolean b3=new Boolean("fdsf");
        System.out.println("b3 = " + b3);
    }
}
