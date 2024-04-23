package com.atguigu.permission2;

import com.atguigu.permission1.Permission1;

public class Test1 {
    /**
     * 不同包，非子父类
     */
    public void methodd(){
        Permission1 p=new Permission1();
        System.out.println(p.num1);
//        System.out.println(p.num2);
//        System.out.println(p.num3);
//        System.out.println(p.num4);
    }
}
