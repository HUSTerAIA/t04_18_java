package com.atguigu.socket1;

import java.net.*;

/**
 * udp协议编程：无连接
 */
public class Send1 {
    public static void main(String[] args) throws Exception {
        /*
        1.创建DatagramSocket对象；
        2.创建DatagramPacket对象打包数据：将要发送的数据bytes[],指定接收端的ip地址，指定接收端的端口号；
        3.发送数据
        4.释放资源
         */
        DatagramSocket socket=new DatagramSocket();     // 1.datagramsocket创建对象
        byte[] bytes="你好".getBytes();       // 2.字符串转成字节数组
        InetAddress ip=InetAddress.getByName("127.0.0.1");      //发给自己      3. 指定ip地址
        int port=6666;      // 4.设置端口号
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,ip,port);       // 5.打包
        socket.send(dp);        // 6.发送
        socket.close();     // 7.释放资源

    }
}
