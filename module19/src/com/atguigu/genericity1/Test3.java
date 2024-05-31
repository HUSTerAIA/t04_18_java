package com.atguigu.genericity1;

public class Test3 {
    public static void main(String[] args) {
        //创建接口的实现类对象
        ListImple1<String> list=new ListImple1<>();
        list.add("sds");
        list.add("sds1");
        list.add("sds2");
        System.out.println(list);

    }
}
