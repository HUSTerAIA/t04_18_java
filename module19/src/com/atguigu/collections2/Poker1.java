package com.atguigu.collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 打扑克
 * 1.创建数组string存花色
 * 2.创建集合list存字母/数字：装箱，数据类型string
 *
 * 3.创建扑克：集合list对象，数据类型string
 * 4.存数字/字母+花色组合
 * 5.存大小王：不需要和花色组合
 * 6.打乱
 *
 * 7.创建玩家：集合list
 * 8.创建底牌：集合list
 * 9.按照索引发牌：玩家+底牌
 */
public class Poker1 {
    public static void main(String[] args) {
        /*
        扑克：
         */
        //1.创建Arraylist集合存花色；
        String[] color = "♣-♥-♦-♠".split("-");      // 数组string[]
        //2.创建存数字
        ArrayList<String> number = new ArrayList<>();
        for(int i=2;i<=10;i++){
            number.add(String.valueOf(i));      // 装箱
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        System.out.println("color = " + Arrays.toString(color));
        System.out.println("number = " + number);
        //3.poker存花色+数字的组合；
        ArrayList<String> poker=new ArrayList<>();
        for(String num:number){
            for(String col:color){
                poker.add(num+col);
            }
        }
        //4.poker存大小王
        poker.add("☺");
        poker.add("😊");
        //5.打乱poker
        Collections.shuffle(poker);
        System.out.println("洗牌:\n"+poker);
        //6.创建4个Arraylist集合代表底牌+3个玩家
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        ArrayList<String> diPai=new ArrayList<>();
        //7.index为最后三张->底牌
//        int index=54;
        for(int index=0;index<poker.size();index++){            // 集合list的非静态方法
            if(index>=51){
                diPai.add(poker.get(index));            // 获取牌面
            }else if(index%3==0){
                p1.add(poker.get(index));
            }else if(index%3==1){
                p2.add(poker.get(index));
            }else if(index%3==2){
                p3.add(poker.get(index));
            }
        }
        //8.index%0->p1;
        //9.%1->p2;
        //10.%2->p3;
        //11.打印看牌
        System.out.println("diPai = " + diPai);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

    }
}
