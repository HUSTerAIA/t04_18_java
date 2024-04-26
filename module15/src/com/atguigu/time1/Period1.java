package com.atguigu.time1;

import java.time.LocalDate;
import java.time.Period;

public class Period1 {
    public static void main(String[] args) {
        //计算日期偏差
        LocalDate ld1=LocalDate.of(2020,5,7);
        LocalDate ld2=LocalDate.now();
        System.out.println("ld1="+ld1);
        System.out.println("ld2 = " + ld2);
        Period p=Period.between(ld1,ld2);
        System.out.println(p.getYears()+"年");
        System.out.println(p.getMonths()+"月");
        System.out.println(p.getDays()+"日");
    }
}
