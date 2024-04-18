package com.atguigu.pack1;

public class Person {
    private String name;    //私有化，仅本类内部使用
    private int age;

    /*
    为name提供set/get方法
     */
    public void setName(String name1) {
        name=name1;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age1) {
        if(age1<0||age1>150){
            System.out.println("不合理");
        }else{
            age=age1;
        }
    }

    public int getAge(){
        return age;
    }

}
