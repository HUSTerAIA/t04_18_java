package com.atguigu.reflect2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取成员方法
 */
public class Reflect0 {
    public static void main(String[] args) throws Exception {
//        get1();
//        get2();
//        get3();
        get4();

    }

    public static void get1() {
        //获取所有public方法
        Class<Person0> person0Class = Person0.class;
        Method[] methods = person0Class.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    /**
     * 获取指定的public方法
     */

    public static void get2() throws Exception {
        //class对象创建
        Class<Person0> person0Class = Person0.class;
        //利用反射，空参构造创建对象
        Person0 p = person0Class.newInstance();
        //获取方法
        Method setName = person0Class.getMethod("setName", String.class);       // 获取指定public方法
        //类比于p.setName(...)
        setName.invoke(p, "saj");
        System.out.println("p = " + p);

        System.out.println("-----------------------");
        //获取getname方法
        Method getName = person0Class.getMethod("getName");
        Object obj = getName.invoke(p);      //相当于 p.getName
        System.out.println("obj = " + obj);
    }

    /**
     * 获取所有成员方法，包括private，不包括父类中的
     */
    public static void get3() {
        Class<Person0> person0Class = Person0.class;
        Method[] methods = person0Class.getDeclaredMethods();       // 所有方法
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

    }

    /**
     * 反射指定成员方法，包括private
     */
    public static void get4() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person0> person0Class = Person0.class;
        Person0 p = person0Class.newInstance();
        Method method = person0Class.getDeclaredMethod("eat");      // 获取指定方法
//解除权限
        method.setAccessible(true);     // 解除私有权限
        method.invoke(p);


    }

}
