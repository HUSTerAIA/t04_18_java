package com.atguigu.time1;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        /*
        时间类
         */
        //获取当前时间
        Date date1=new Date();
        System.out.println(date1);
        //获取指定时间
        Date date2=new Date(1000);  //传递毫秒值，起始点为时间原点
        System.out.println(date2);

        //设置时间
        Date date3=new Date();
        date3.setTime(1000L);   //传递毫秒值
        System.out.println(date3.getTime());    //返回毫秒值
    }
}
