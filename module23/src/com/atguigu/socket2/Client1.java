package com.atguigu.socket2;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端：发送数据
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        /*
        客户端：后开启
        1.创建socket对象，指明ip地址和端口号
        2.调用socket中的getOutputStream，往服务器发送请求；
        3.调用socket中的getInputStream,读取服务器响应回来的数据；
        4.关流
         */
        Socket socket = new Socket("127.0.0.1", 8080);      // 1.
        OutputStream os = socket.getOutputStream();     // 2、写数据
        os.write("你好".getBytes());      // 3.发送
        //接收请求
        InputStream is = socket.getInputStream();       // 4.读取服务器返回的响应
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
//关闭流：逆序
        is.close();
        os.close();
        socket.close();

    }
}
