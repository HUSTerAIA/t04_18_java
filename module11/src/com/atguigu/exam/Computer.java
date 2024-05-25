package com.atguigu.exam;

/**
 * 定义电脑类
 */
public class Computer {
    public void start(){
        System.out.println("电脑开机");
    }
    //使用USB设备
    public void useUSB(USB usb){        //多态，向上转型
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;        // 向下转型
            mouse.open();
            mouse.method();
            mouse.close();
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
