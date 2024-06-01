package com.atguigu.map4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 斗地主
 */
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
        //1.花色和数字/字母分别存入string[]数组
        String[] color = "♠-♣-♦-♥".split("-");
        String[] number="2,3,4,5,6,7,8,9,10,J,Q,K,A".split(",");
        //牌面
        // 2.创建大小王数字存入单列集合collection的list
        ArrayList<Integer> paiMian=new ArrayList<>();
        paiMian.add(0);
        paiMian.add(1);
        //hashmap组合
        //3. 创建组合对象：双列集合map，键值对泛型为integer=string
        HashMap<Integer,String> zuhe=new HashMap<>();

        // 4.zuhe存入键值对：数字/字母=花色/大小王；paimian存入数字，字母JQKA转成11,12,13,14
        zuhe.put(0,"😊");
        zuhe.put(1,"☺");
        int key=2;
        for (String num:number){
            for(String col:color){      // 先遍历花色，在遍历数字+字母
                zuhe.put(key,num+col);
                paiMian.add(key);
                key++;
            }
        }
//        System.out.println(zuhe);
//        System.out.println("paiMian = " + paiMian);

        //打乱
        // 5.洗牌：collection顶级接口的静态成员方法
        Collections.shuffle(paiMian);
        //发牌
        //6.创建牌友+底牌对象：单列集合collection的list的arraylist，只是存入数字+字母数字
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> diPai=new ArrayList<>();
        //7.index为最后三张->底牌
//        int index=54;
        // 7.根据key索引发牌
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
        // 8.根据默认规则ASCII（先数字后花色）排序：单列集合顶级接口静态成员方法
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(diPai);


        //看牌

        // 9.看牌
        lookPoker("张三",p1,zuhe);

        lookPoker("李四",p2,zuhe);
        lookPoker("王五",p3,zuhe);
        lookPoker("底",diPai,zuhe);
    }

    public static void lookPoker(String name,ArrayList<Integer> p,HashMap<Integer,String> zuhe){
        System.out.print(name+"牌：");
        // 双列集合遍历方式2：获取key，根据key查询value
        for(Integer  key:p){
            String pai=zuhe.get(key);   //获取数字+花色
            System.out.print(pai+"  ");
        }

        System.out.println();
    }
}
