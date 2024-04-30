package com.atguigu.new_chara;

public interface USB {
    private void open(){
        System.out.println("私有非静态方法");
    }

    private static void close(){
        System.out.println("私有静态方法");
    }

    //定义默认方法调用私有方法
    public default void methodDef(){
        open();
        close();
    }
}
