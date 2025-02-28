package com.atguigu.pack4;

/**
 * javabean
 */
public class Person {
    private String name;    //私有化，仅本类内部使用
    private int age;

    public Person(){
        //jvm自带,无参构造
    }

    /*
    为name提供set/get方法
     */
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            System.out.println("不合理");
        }else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }

}
