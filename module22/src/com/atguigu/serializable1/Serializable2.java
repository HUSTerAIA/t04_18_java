package com.atguigu.serializable1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 序列化流
 * input读取文件
 */
public class Serializable2 {
    public static void main(String[] args) throws Exception {
        //反序列化，读取文件
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("io\\9.txt"));
        ArrayList<Person1> pList = (ArrayList<Person1>) ois.readObject();
        for (Person1 p : pList) {
            System.out.println(p);
        }
        ois.close();

    }
}
