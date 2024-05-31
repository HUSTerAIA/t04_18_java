package com.atguigu.genericity1;

import java.util.Arrays;

/**
 * 泛型：统一数据类型，防止未来出现类型转换异常
 * 定义包含泛型的类
 * @param <E>
 */
public class Genericity1<E> {       // 默认object，基类
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
        this.size++;
        return true;
    }

    /*
    定义get方法获取元素值
     */

    public E get(int index){        // 返回值：泛型E
        return (E) obj[index];      // 强制类型转换
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
