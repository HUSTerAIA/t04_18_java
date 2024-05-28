package com.atgiugu.object2;

import java.util.Objects;

public class Person implements Cloneable{       // 实现cloneable接口
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString

/*    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }*/


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //重写equals
    /*
    1.obj接收Person类型，无法直接调用子类的特有成员age,name;
    多态->向下转型

    2.传递的不是Person类型，就会出现类型转换异常；
    ->先判断类型

    3.传递null空指针直接返回false

    4.传递自己直接返回true

     */
/*    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;   //向下转型
            return this.name.equals(p.name) && this.age == p.age;  //其中name为string类型
        }
        return false;
    }*/

    //直接生成alt+insert快捷键选择
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;     // 小类型接大类型，向下转型，强制类型转换
        return age == person.age && Objects.equals(name, person.name);      // 比较内容
    }


    //重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
