package com.atguigu.loader0;

public class ClassLoader0 {
    public static void main(String[] args) {
        appMethod();

    }

    /**
     * 负责加载自定义类和第三方jar包下的类
     */
    public static void appMethod(){
        ClassLoader classLoader=ClassLoader0.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
    }
}
