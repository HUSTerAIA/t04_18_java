package com.atguigu.annotation1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解
 */
@Target({ElementType.TYPE,ElementType.METHOD})      //元注解：控制注解能够在类、方法中使用
@Retention(RetentionPolicy.RUNTIME)     // 元注解：控制注解能够在内存中出现
public @interface Book {
    String bookName();      // 成员属性需要利用注解设置默认值
    String[] author();
    int price();
    int count() default 100;        // 已经设置默认初始值
}
