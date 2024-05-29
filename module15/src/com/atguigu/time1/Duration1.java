package com.atguigu.time1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 时间差：精确日时秒
 */
public class Duration1 {
    public static void main(String[] args) {
        //计算日期偏差
        LocalDateTime ld1=LocalDateTime.of(2020,5,7,23,46,2);
        LocalDateTime ld2=LocalDateTime.now();
        System.out.println("ld1="+ld1);
        System.out.println("ld2 = " + ld2);

        Duration d1= Duration.between(ld1,ld2);
        System.out.println(d1.toDays()+"天");
        System.out.println(d1.toMillis()+"毫秒");


    }
}
