package com.atguigu.genericity1;

public class Test {
    public static void main(String[] args) {
        Genericity1<String> g1=new Genericity1<>();
        g1.add("sd");
        g1.add("ser");
        g1.add("sdf");
        System.out.println(g1.toString());

        Genericity1<Integer> g2=new Genericity1<>();
        g2.add(1);
        g2.add(2);
        g2.add(3);

        System.out.println(g2.get(1));

    }
}
