package com.atguigu.time1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendar1 {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();     //抽象类，多态
        System.out.println("c1 = " + c1);

        //返回给定日历字段的值
        Calendar c2=Calendar.getInstance();
        int year1=c1.get(Calendar.YEAR);
        System.out.println("year1 = " + year1);

        //设置字段
        c2.set(Calendar.YEAR,2025);
        System.out.println(c2.get(Calendar.YEAR));

        //增加字段
        c2.add(Calendar.YEAR,2);
        System.out.println(c2.get(Calendar.YEAR));

        //转成date
        Date d1=c2.getTime();
        System.out.println(d1);

        method();
    }

    public static void method(){
        /*
        判断闰年平年
        1.创建calendar对象
        2.键盘录入年份
        3.设置3月1日
        4.设置date-1；
        5.判断当前为2月29/28
        6.输出结果

         */
        Calendar c1=Calendar.getInstance();
        System.out.println("输入年份：");
        Scanner sc=new Scanner(System.in);
        int year1=sc.nextInt();
        c1.set(year1,2,1);
        c1.add(Calendar.DAY_OF_MONTH,-1);

        if(c1.get(Calendar.DAY_OF_MONTH)==29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
}
