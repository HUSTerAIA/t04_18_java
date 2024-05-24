package com.atguigu.Var;

public class Demo1Var {
    public static void main(String[] args) {
        String result=concat("-","asfjh","时间啊v科技","382467fdfd");        // 静态方法
        System.out.println("result = " + result);
    }

    public static String concat(String div,String...str){       // 可变参数
        String strAll="";
        for(int i=0;i<str.length;i++){
            strAll+=str[i];
            if(i!=str.length-1){
                strAll+=div;
            }
        }
        return strAll;
    }
}
