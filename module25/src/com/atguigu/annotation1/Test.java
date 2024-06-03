package com.atguigu.annotation1;

@Book1("rrg")       // 只有一个成员变量value，不用写属性名
@Book(bookName = "ahjs",author={"sdf","sdv"},price = 10)        // 设置默认值，分隔
public class Test {
    @Book(bookName = "ahjs",author={"sdf","sdv"},price = 10)
    public static void main(String[] args) {

    }

}
