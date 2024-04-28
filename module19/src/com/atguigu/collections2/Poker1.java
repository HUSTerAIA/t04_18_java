package com.atguigu.collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Poker1 {
    public static void main(String[] args) {
        /*
        扑克：
         */
        //1.创建Arraylist集合存花色；
        String[] color = "♣-♥-♦-♠".split("-");
        //2.创建存数字
        ArrayList<String> number = new ArrayList<>();
        for(int i=2;i<=10;i++){
            number.add(String.valueOf(i));
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
        System.out.println(poker);
        //6.创建4个Arraylist集合代表底牌+3个玩家
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        ArrayList<String> diPai=new ArrayList<>();
        //7.index为最后三张->底牌
//        int index=54;
        for(int index=0;index<poker.size();index++){
            if(index>=51){
                diPai.add(poker.get(index));
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
