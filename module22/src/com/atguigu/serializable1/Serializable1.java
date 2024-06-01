package com.atguigu.serializable1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 序列化流
 * output写入文件
 */
public class Serializable1 {
    //序列化,写文件
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("io\\9.txt"));
        Person1 p1 = new Person1("abc遇到", 18);
        Person1 p2 = new Person1("ajh",23);
        Person1 p3 = new Person1("erfg",34);
        ArrayList<Person1> pList=new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);

        oos.writeObject(pList);
        oos.close();
    }
}
