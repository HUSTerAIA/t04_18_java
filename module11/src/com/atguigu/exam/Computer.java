package com.atguigu.exam;

public class Computer {
    /**
     * 定义电脑类
     */
    public void start(){
        System.out.println("电脑开机");
    }
    //使用USB设备
    public void useUSB(USB usb){        //多态
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.open();
            mouse.method();
        }else{
            Keyborad Keyborad=(Keyborad) usb;
            Keyborad.open();
            Keyborad.method();
        }
    }
    public void stop(){
        System.out.println("电脑关机");
    }
}
