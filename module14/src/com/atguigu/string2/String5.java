package com.atguigu.string2;

import java.util.Objects;

public class String5 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        String s4=new String();
        String s5=null;

        if(s1==s2){
            System.out.println("s1==s2");
        }

        if("abc".equals(s1)){
            //可以防止第一个比较值为null
            System.out.println("s1==abc");
        }

        if(Objects.equals(s4,s5)){
            //可以防止两个为空指针
            System.out.println("s4==s5");
        }
    }
}
