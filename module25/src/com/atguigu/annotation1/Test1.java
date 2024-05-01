package com.atguigu.annotation1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /**
         * 1.获取BookShelf的class对象
         * 2.判断是否有book注解
         * 3.true则获取
         */
        Class<BookShelf> bookShelfClass = BookShelf.class;
        boolean b = bookShelfClass.isAnnotationPresent(Book.class);
        System.out.println(b);
        if (b) {
            Book book = bookShelfClass.getAnnotation(Book.class);
            System.out.println(book.bookName());
            System.out.println(Arrays.toString(book.author()));
            System.out.println(book.price());
            System.out.println(book.count());
        }

        //没有解析成功
    }
}
