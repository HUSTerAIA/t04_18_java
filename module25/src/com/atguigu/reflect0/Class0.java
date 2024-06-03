package com.atguigu.reflect0;

import org.junit.Test;

/**
 * 获取class对象
 */
public class Class0 {


    /**
     * 方法1：调用object中的getClass()方法
     * Class <?> getClass();
     */
    @Test
    public void get1() {
        Person0 p = new Person0();
        Class class0 = p.getClass();        // 获取方法
        System.out.println("class0 = " + class0);
    }

    /**
     * 最常用
     * 方法2：无论是基本数据类型还是引用数据类型，jvm提供了静态成员class
     */
    @Test
    public void get2() {
        Class<Person0> class1 = Person0.class;      // 静态成员属性
        System.out.println("class1 = " + class1);
    }

    /**
     * 方法3：Class类中的静态方法：
     * static Class<?> forName(String classname)   ->classname传递的是类的全限定名（包名.类名）
     */
    @Test
    public void get3() throws Exception {
        Class<?> class2 = Class.forName("com.atguigu.reflect0.Person0");        // 静态成员方法
        System.out.println("class2 = " + class2);



    }


}
