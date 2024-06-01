package com.atguigu.socket1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 接受端
 *
 * 1.创建socket对象
 * 2.创建接受数据的对象
 * 3.接受数据
 * 4.解析数据包：ip地址、端口号；数据长度，数据
 * 5.释放资源
 */
public class Receive1 {
    public static void main(String[] args) throws Exception{
        //1.创建DatagramSocket对象
        DatagramSocket socket=new DatagramSocket(6666);
        //2.接受数据包
        byte[] bytes=new byte[1024];        //默认长度,接受数据存放
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        socket.receive(dp);
        //3.解析数据包
        byte[] data=dp.getData();       //接收端数据
        int len=dp.getLength();         //接受的长度
        InetAddress address=dp.getAddress();        //主机地址
        int port=dp.getPort();  //端口号
        System.out.println(new String(data,0,len));
        System.out.println(address+"..."+port);
        //4.释放资源
        socket.close();

    }
}
