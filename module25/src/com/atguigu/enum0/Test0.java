package com.atguigu.enum0;

public class Test0 {
    public static void main(String[] args) {
        State0 enum0=State0.ENUM0;      // 构造私有化
        State0 enum1=State0.ENUM1;      // 调用静态成员属性：直接调用
        System.out.println("enum1 = " + enum1);     //默认调用toString()，枚举名字
        System.out.println(enum0.getName());        // 枚举的值

        //toString
        String s=State0.ENUM0.toString();       // 枚举的名字
        System.out.println(s);

        System.out.println("---------value---------------");
        State0[] values=State0.values();
        for(State0 value:values){
            System.out.println(value);
        }

        System.out.println("---------valueof------------------");
        State0 enum_name=State0.ENUM1.valueOf("ENUM0");
        System.out.println(enum_name);
    }
}
