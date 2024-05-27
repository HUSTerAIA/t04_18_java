package com.atguigu.permission1;

public class Test{
    /*
    同包不同类，只能访问public,protected,空
     */
    public static void main(String[] args) {
        Permission1 p=new Permission1();
        System.out.println(p.num1);
        System.out.println(p.num2);
        System.out.println(p.num3);
//        System.out.println(p.num4); //private私有不能访问
    }
}
