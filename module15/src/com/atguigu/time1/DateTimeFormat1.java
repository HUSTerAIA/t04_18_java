package com.atguigu.time1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormat1 {
    public static void main(String[] args) {
        //日期格式化
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time1="2024-02-01 20:25:16";
        //time1格式化
        TemporalAccessor ta=dtf.parse(time1);
        System.out.println(ta);
        String s1=dtf.format(ta);
        System.out.println("s1 = " + s1);

        //格式转换
        LocalDateTime ldt=LocalDateTime.from(ta);
        System.out.println("ldt = " + ldt);

    }
}
