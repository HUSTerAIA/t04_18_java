package com.atguigu.pack2;

public class Person {
     String name;       // 权限：空

    public void speak(String name){
        System.out.println(this+"=======");     // this代表当前对象person类
        System.out.println(this.name+"..."+name);
    }
}
