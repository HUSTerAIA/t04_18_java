package com.atguigu.math1;

import java.math.BigInteger;

public class Math2 {
    public static void main(String[] args) {
//        BigInteger add(BigInteger val)    //返回其值为(this+val)的BigInteger
        BigInteger num1=new BigInteger("632477272937492348");       // 参数格式为数字形式的string
        BigInteger num2=new BigInteger("6324772729374923454346348");
        System.out.println(num1.add(num2));     // 访问非静态成员：new对象，对象.方法名
//        BigInteger subtract(BigInteger val)    //返回其值为(this-val)的BigInteger
        System.out.println(num1.subtract(num2));
//        BigInteger multiply(BigInteger val)    //返回其值为(this*val)的BigInteger
        System.out.println(num1.multiply(num2));
//        BigInteger divide(BigInteger val)    //返回其值为(this/val)的BigInteger
        System.out.println(num2.divide(num1));
    }
}
