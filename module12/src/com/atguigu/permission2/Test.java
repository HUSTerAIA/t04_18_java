package com.atguigu.permission2;

import com.atguigu.permission1.Permission1;

public class Test extends Permission1 { // 继承
    /*
    不同包子父类，只能访问public,protected
     */
    public void method(){
        //继承
        System.out.println(super.num1);
        System.out.println(super.num2);
//        System.out.println(super.num3);
//        System.out.println(super.num4);
    }

}
