package com.atguigu.junit0;

import org.junit.Test;

public class Test2 {
    public static void main(String[] args) {
        // 主方法空
    }

    /**
     * 专门测试方法1
     */
    @Test
    public void test1() {
        Test1 t1 = new Test1();
        int num = t1.method1();
        System.out.println(num);
    }

    /**
     * 专门测试方法2
     */
    @Test
    public void test2() {
        Test1 t1 = new Test1();
        int num = t1.method2();
        System.out.println("num = " + num);

    }
}
