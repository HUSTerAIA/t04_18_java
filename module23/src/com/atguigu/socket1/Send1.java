package com.atguigu.socket1;

import java.net.*;

public class Send1 {
    public static void main(String[] args) throws Exception {
        /*
        1.创建DatagramSocket对象；
        2.创建DatagramPacket对象打包数据：将要发送的数据bytes[],指定接收端的ip地址，指定接收端的端口号；
        3.发送数据
        4.释放资源
         */
        DatagramSocket socket=new DatagramSocket();
        byte[] bytes="你好".getBytes();
        InetAddress ip=InetAddress.getByName("127.0.0.1");      //发给自己
        int port=6666;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,ip,port);
        socket.send(dp);
        socket.close();

    }
}
