package com.atgiugu.object2;

public class Object2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p=new Person("a",1);
        Object obj= p.clone();      //克隆内容
        Person p1=(Person) obj; //强制类型转换，多态，向下转型
        System.out.println(p==p1);      // 地址值不同
        System.out.println(p.equals(p1));   // 内容一致
    }
}
