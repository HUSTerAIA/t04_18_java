package com.atguigu.enum0;

public class Test0 {
    public static void main(String[] args) {
        State0 enum0=State0.ENUM0;
        State0 enum1=State0.ENUM1;
        System.out.println("enum1 = " + enum1);     //默认调用toString()
        System.out.println(enum0.getName());

        //toString
        String s=State0.ENUM0.toString();
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
