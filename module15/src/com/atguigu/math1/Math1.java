package com.atguigu.math1;

public class Math1 {
    public static void main(String[] args) {
        //不能创建math对象
//        static int abs (inta) -> 求参数的绝对值
        System.out.println(Math.abs(-343));     // 静态成员，直接调用

//static doub1ecei1(doub1ea)->向上取整
        System.out.println(Math.ceil(3.3));
//static doub1ef1oor(doub1ea)->向下取整
        System.out.println(Math.floor(3.5));

//        static long round (double a) -> 四舍五入
        System.out.println(Math.round(-3.4));

//        static int max (inta, intb) -> 求两个数之间的较大值
        System.out.println(Math.max(19, Math.max(47, 39)));
//        static int min (1 nta, 1 ntb)->求两个数之间的较小值
        System.out.println(Math.min(-34, -54));

        int num =Math.max(11,12);
        System.out.println("num = " + num);
    }
}
