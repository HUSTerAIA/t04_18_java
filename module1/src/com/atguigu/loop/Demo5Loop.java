package com.atguigu.loop;

public class Demo5Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==3){
//                break;  //结束循环
                continue;   //结束本次循环
            }
            System.out.println("i = " + i);
        }

    }

}
