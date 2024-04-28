package com.atguigu.map4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker1 {
    public static void main(String[] args) {
        /*
       斗地主：
       1.存花色的数组，存数字的数组
       2.创建map集合，key为数字，value为花色
       3.创建arraylist存牌面大小
       4.组合牌存入map，key为牌面大小
       5.打乱牌面
       6.发牌
       7.牌面排序
       8.看牌：根据牌面序号找map集合元素
         */
        //数字+花色
        String[] color = "♠-♣-♦-♥".split("-");
        String[] number="2,3,4,5,6,7,8,9,10,J,Q,K,A".split(",");
        //牌面
        ArrayList<Integer> paiMian=new ArrayList<>();
        paiMian.add(0);
        paiMian.add(1);
        //hashmap组合
        HashMap<Integer,String> zuhe=new HashMap<>();
        zuhe.put(0,"😊");
        zuhe.put(1,"☺");
        int key=2;
        for (String num:number){
            for(String col:color){
                zuhe.put(key,num+col);
                paiMian.add(key);
                key++;
            }
        }
//        System.out.println(zuhe);
//        System.out.println("paiMian = " + paiMian);

        //打乱
        Collections.shuffle(paiMian);
        //发牌
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> diPai=new ArrayList<>();
        //7.index为最后三张->底牌
//        int index=54;
        for(int index=0;index<paiMian.size();index++){
            Integer key1=paiMian.get(index);
            if(index>=51){
                diPai.add(key1);
            }else if(index%3==0){
                p1.add(key1);
            }else if(index%3==1){
                p2.add(paiMian.get(index));
            }else if(index%3==2){
                p3.add(paiMian.get(index));
            }
        }

        //排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(diPai);


        //看牌

        lookPoker("张三",p1,zuhe);
        lookPoker("李四",p2,zuhe);
        lookPoker("王五",p3,zuhe);
        lookPoker("底",diPai,zuhe);
    }

    public static void lookPoker(String name,ArrayList<Integer> p,HashMap<Integer,String> zuhe){
        System.out.print(name+"牌：");

        for(Integer  key:p){
            String pai=zuhe.get(key);   //获取数字+花色
            System.out.print(pai+"  ");
        }

        System.out.println();
    }
}
