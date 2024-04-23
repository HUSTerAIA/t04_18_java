package com.atguigu.class3;

public class Test {
    public static void main(String[] args) {
        //作为方法参数
        Person person=new Person(); //传递对象
        method(person);

        //作为返回值
        Person person1=method();    //返回对象
        person1.eat();
    }

    public static void method(Person person){
        person.eat();
    }

    public static Person method(){
        return new Person();
    }
}
