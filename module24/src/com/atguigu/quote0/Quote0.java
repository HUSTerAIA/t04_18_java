package com.atguigu.quote0;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * 引用
 */
public class Quote0 {
    public static void main(String[] args) {
        /*
        accept为重写方法：参数类型String,无返回值
        accept方法里g面有println方法：参数类型String，操作重写方法的参数（accept的string），无返回值
         */
        Stream<String> stream = Stream.of("a", "b", "c");       // 流式

/*
        stream.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });
*/


/*
        System.out.println("----------lambda-----------------");
        stream.forEach( s ->
                System.out.println(s)

        );
*/

        System.out.println("-----引用方法-------------");
        stream.forEach(
                System.out::println
        );


    }
}
