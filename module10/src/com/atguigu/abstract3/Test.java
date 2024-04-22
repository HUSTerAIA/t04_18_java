package com.atguigu.abstract3;

public class Test {
    public static void main(String[] args) {
        Andriod a=new Andriod();
        a.setId(1);
        a.setName("A");
//        System.out.println(a.getId()+"..."+a.getName()+"...");
        a.work();


        Java j=new Java(2,"J");
        System.out.println(j.getId()+"..."+j.getName()+"...");
        j.work();


    }
}
