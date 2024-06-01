package com.atguigu.socket2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp编程：有连接
 *
 * 服务器端先开启
 * 接受数据
 */
public class Server1 {
    public static void main(String[] args) throws Exception{
        /**
         * 服务器端:先启动
         * 1.创建serverrocket对象，指定端口号
         * 2.调用serversocket中的accept方法，等待客户端连接，返回socket对象；
         * 3.调用socket的getinputstream，读取客户端的请求
         * 4.调用getoutputstream发送响应
         * 5.关闭流
         */
        ServerSocket ss=new ServerSocket(8080);     // 比客户端多的部分
        //accept
        Socket socket=ss.accept();
        //读取请求
        InputStream is = socket.getInputStream();       //3.input读取：接收数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //发送响应
        OutputStream os = socket.getOutputStream();     // 4.output写入：发送响应
        os.write("我很好".getBytes());
        //
        is.close();
        os.close();
        socket.close();
        ss.close();


    }
}
