package com.atguigu.upload1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * s-fis-os
 */
public class Client1 {
    public static void main(String[] args) throws Exception{
        /**
         * 客户端上传文件
         * 1.创建socket对象，设置ip和端口号
         * 2.创建fileinputstream,读取本地图片；
         * 3.调用socket的方法，getoutputstream,发生请求，将图片发送到服务器；
         * 4，边读边写
         * 5.读取响应结果
         */

        Socket socket=new Socket("127.0.0.1",6666);

        FileInputStream fis=new FileInputStream("io\\1.jpg");
        //客户端发送请求
        OutputStream os =socket.getOutputStream();
        //边读边写
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){      // 读取上传的文件
            os.write(bytes,0,len);      // 写入数据
        }
        //写入结束标志
        socket.shutdownOutput();
        System.out.println("=========发送结束，等待服务器响应============");

        //读取服务器响应
        InputStream is=socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes);
        System.out.println(new String(bytes1, 0, len1));

        //关流
        is.close();
        os.close();
        fis.close();
        socket.close();

    }
}
