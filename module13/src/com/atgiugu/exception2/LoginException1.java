package com.atgiugu.exception2;


import javax.security.auth.login.LoginException;

public class LoginException1 extends Exception{     // 继承顶端异常
    /*
    自定义异常对象，继承
     */
    public LoginException1(){
        //无参构造，默认存在super();
    }

    public LoginException1(String message){
        //有参构造，自动调用
        super(message); //调用父类有参构造方法
    }

}
