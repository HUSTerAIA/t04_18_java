package com.atguigu.objectarray;

public class Demo1Array {
    public static void main(String[] args) {
        Person[] people = new Person[3];        //对象数组
        people[0] = new Person("张三",68);
        people[1] = new Person("李四",67);
        people[2] = new Person("王五",34);
        /*
        按照年龄冒泡排序
         */
        for (int j = 0; j < people.length - 1; j++) {
            for (int i = 0; i < people.length - 1-j; i++) {
                if (people[i].getAge() > people[i + 1].getAge()) {
                    Person temp =people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName()+"..."+people[i].getAge());
        }

    }
}
