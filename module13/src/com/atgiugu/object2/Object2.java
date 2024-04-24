package com.atgiugu.object2;

public class Object2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p=new Person("a",1);
        Object obj= p.clone();
        Person p1=(Person) obj; //强制类型转换
        System.out.println(p==p1);
        System.out.println(p.equals(p1));
    }
}
