package com.atguigu.time1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDate1 {
    public static void main(String[] args) {
        //创建对象
        LocalDate ld=LocalDate.now();   //构造私有化，不能new对象，访问静态成员
        System.out.println("ld = " + ld);
        //设置时间
        LocalDate ld1=LocalDate.of(2024,4,1);
        System.out.println("ld1 = " + ld1);

        //LocalDateTime
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDateTime ldt1=LocalDateTime.of(2024,4,1,12,34,56);
        System.out.println("ldt1 = " + ldt1);

        //获取时间
        System.out.println(ld1.getYear());
        System.out.println(ld1.getMonthValue());
        System.out.println(ld1.getDayOfMonth());

        //链式调用
        LocalDate ld2=LocalDate.now();
        System.out.println("ld2 = " + ld2);
        LocalDate ld3=ld2.withYear(2023).withMonth(1).withDayOfMonth(2);
        System.out.println("ld3 = " + ld3);

        //改变时间
        LocalDate ld4=LocalDate.now();
        System.out.println("ld4 = " + ld4);
        LocalDate ld5=ld4.plusYears(3L);
        System.out.println("ld5 = " + ld5);
        LocalDate ld6=ld4.minusMonths(4L);
        System.out.println("ld6 = " + ld6);

    }
}
