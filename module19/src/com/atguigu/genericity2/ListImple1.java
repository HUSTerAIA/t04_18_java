package com.atguigu.genericity2;

import java.util.Arrays;

public class ListImple1 implements List1<String> {
    /*
    实现接口
     */
    //定义数组，充当ArrayList底层数组，长度为10
    Object[] obj = new Object[10];
    //索引值
    int size;

       /*
    定义add方法
     */
    public boolean add(String e) {
        obj[size]=e;
        size++;
        return true;
    }

    /*
    定义get方法获取元素值
     */

    public String get(int index){
        return (String) obj[index];     // 强制类型转换
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
