package com.atguigu.abstract3;

public class Test {
    public static void main(String[] args) {
        Andriod a=new Andriod();
        a.setId(1);
        a.setName("A");     // 继承
//        System.out.println(a.getId()+"..."+a.getName()+"...");
        a.work();


        Java j=new Java(2,"J");     // 调用顶级父类有参构造
        System.out.println(j.getId()+"..."+j.getName()+"...");      // 继承，成员方法
        j.work();       // 继承，重写抽象方法


    }
}
