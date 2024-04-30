package com.atguigu.junit0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test0 {
    @Test
    public void method() {
        System.out.println("junit测试");
    }

    @Test
    public void method1(){
        System.out.println("method2测试");
    }


@Before
    public void methodBefore(){
        System.out.println("before方法");
    }

    @After
    public void methodAfter(){
        System.out.println("after方法");
    }


}
