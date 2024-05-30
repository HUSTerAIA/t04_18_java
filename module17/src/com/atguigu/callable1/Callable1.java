package com.atguigu.callable1;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<String> {        // 实现callable接口，指定返回值类型为string
    /*
    实现Callable类
     */
    //重写

    public String call(){
        return "实现callable接口";
    }

}
