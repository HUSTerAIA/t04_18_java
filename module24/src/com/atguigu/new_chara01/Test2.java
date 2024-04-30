package com.atguigu.new_chara01;

public class Test2 {
    public static void main(String[] args) {
        int num = 2;
        var temp=switch (num) {
            case 1 ->
            {
                yield "a";
            }
            case 2 ->
            {
                yield "b";
            }
            default ->
            {
                yield "默认";
            }
        };
        System.out.println("temp = " + temp);
    }
}
