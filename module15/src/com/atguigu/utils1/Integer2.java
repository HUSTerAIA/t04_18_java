package com.atguigu.utils1;

/**
 * 包装类
 */
public class Integer2 {
    public static void main(String[] args) {
        //自动装箱拆箱
        Integer num1=10;        //自动装箱  integer num1=integer.valueof(10)
        System.out.println(num1);
        Integer num2=num1+8;    //自动拆箱再装箱  integer num2 = integer.valueof(num1.intvalue()+10)
        System.out.println("num2 = " + num2);


        //引用数据类型，比较地址值
        Integer num3=100;
        Integer num4=100;
        System.out.println(num3==num4);

        Integer num5=200;       // 200>+128，创建新integer对象
        Integer num6=200;
        System.out.println(num5==num6);

    }
}
