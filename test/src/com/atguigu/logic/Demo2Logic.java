package com.atguigu.logic;

public class Demo2Logic {
    public static void main(String[] args) {
        int i=24;
        int j=35;
        boolean result=(++i>30)& (++j>37);
        System.out.println(result);
        System.out.println(j);

        int x=24;
        int y=35;
        boolean result2=(++x>30)&& (++y>37);
        System.out.println("result2="+result2);
        System.out.println(y);

    }
}
