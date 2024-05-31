package com.atguigu.genericity1;

public class Test {
    public static void main(String[] args) {
        Genericity1<String> g1=new Genericity1<>();     // 定义存入泛型string
        g1.add("sd");
        g1.add("ser");
        g1.add("sdf");
        System.out.println(g1.toString());

        Genericity1<Integer> g2=new Genericity1<>();        //定义存入泛型Integer
        g2.add(1);      // 自动装箱int->Integer
        g2.add(2);
        g2.add(3);

        System.out.println(g2.get(1));

    }
}
