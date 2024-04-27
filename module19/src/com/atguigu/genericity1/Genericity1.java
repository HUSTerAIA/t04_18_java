package com.atguigu.genericity1;

import java.util.Arrays;

public class Genericity1<E> {
    /**
     * 定义含泛型的类
     */
    //定义数组，充当ArrayList底层数组，长度为10
    Object[] obj = new Object[10];
    //索引值
    int size;

    /*
    定义add方法
     */
    public boolean add(E e) {
        obj[size]=e;
        size++;
        return true;
    }

    /*
    定义get方法获取元素值
     */

    public E get(int index){
        return (E) obj[index];
    }

    /*
    重写toString
     */

    @Override
    public String toString() {
        return "Genericity1{" +
                "obj=" + Arrays.toString(obj) +
                ", size=" + size +
                '}';
    }
}
