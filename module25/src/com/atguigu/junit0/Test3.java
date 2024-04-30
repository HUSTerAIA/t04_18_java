package com.atguigu.junit0;

import org.junit.*;

public class Test3 {
    @Test
    public void method() {
        System.out.println("junit测试");
    }

    @Test
    public void method1(){
        System.out.println("method2测试");
    }


@BeforeClass
    public static void methodBefore(){
        System.out.println("before方法");
    }

    @AfterClass
    public static void methodAfter(){
        System.out.println("after方法");
    }


}
