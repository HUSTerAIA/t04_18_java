package com.atguigu.socket2;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws Exception {
        /*
        客户端：
        1.创建socket对象，指明ip地址和端口号
        2.调用socket中的getOutputStream，往服务器发送请求；
        3.调用socket中的getInputStream,读取服务器响应回来的数据；
        4.关流
         */
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());
        //接收请求
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
//关闭流
        is.close();
        os.close();
        socket.close();

    }
}
