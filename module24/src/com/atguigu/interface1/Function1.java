package com.atguigu.interface1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Function;

/**
 * function：数据类型转换
 */
public class Function1 {
    //数字转换成字符串,然后拼接1
    public static void main(String[] args) {
        method(new Function<Integer, String>() {        // 1.调用方法，传递参数
            @Override
            public String apply(Integer integer) {      // 3.重写方法
                return integer + "";
            }
        }, 100);


        System.out.println("--------lambda---------------");
        method(( integer) ->
                 integer + ""

        , 100);
    }



    public static void method(Function<Integer, String> function, Integer number) {
        //function
        String s = function.apply(number);      //2.调用重写方法
        System.out.println("s=" + (s + 1));
    }
}
