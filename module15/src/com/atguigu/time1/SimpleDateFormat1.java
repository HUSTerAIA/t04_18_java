package com.atguigu.time1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {
    public static void main(String[] args) throws ParseException {
        //日期格式化
        Date date1=new Date();
        System.out.println(date1);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm-ss");
        String time=sdf.format(date1);
        System.out.println("time = " + time);

        //转换格式
        Date date2=sdf.parse(time);
        System.out.println("date2 = " + date2);
/*        //格式错误
        String time2="2024-4-1 12:34/56";
        System.out.println(sdf.parse(time2));*/

    }
}
