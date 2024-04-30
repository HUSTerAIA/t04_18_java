package com.atguigu.interface1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Function;

public class Function1 {
    //数字转换成字符串,然后拼接1
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
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
        String s = function.apply(number);
        System.out.println("s=" + (s + 1));
    }
}
