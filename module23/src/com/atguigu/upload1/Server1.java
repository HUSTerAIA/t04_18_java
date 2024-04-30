package com.atguigu.upload1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

import static com.atguigu.upload1.CloseAll1.closeAll;

public class Server1 {
    public static void main(String[] args) throws Exception {
        /**
         * 服务器端：接收图片
         * 0.开启服务器
         * 1.创建socket对象，设置端口号；
         * 2.调用socket的方法，getiutputstream,接收客户端发送的请求；
         * 3.创建fileoutputstream,将图片写入本地；
         * 4.边读边写
         * 5.发送接收成功的响应结果
         */


        //开启
        ServerSocket ss = new ServerSocket(6666);

        while (true) {
            //等待accept
            Socket s = ss.accept();

            new Thread(new Runnable() {
                /*
多线程，其实不用关闭服务器
 */
                @Override
                public void run() {
                    InputStream is = null;
                    FileOutputStream fos = null;
                    OutputStream os = null;
                    try {
                        //接收图片
                        is = s.getInputStream();

                        //上传文件取名
                        String str = UUID.randomUUID().toString();       //十六进制
                        String name = str + "_" + System.currentTimeMillis();
                        //写入本地硬盘
                        fos = new FileOutputStream("io\\io2\\" + name + ".jpg");
                        byte[] b = new byte[1024];
                        int len = 0;
                        while ((len = is.read(b)) != -1) {
                            fos.write(b, 0, len);
                        }
                        //发送响应结果
                        System.out.println("==========服务器接收完毕，发送响应结果======");
                        os = s.getOutputStream();
                        os.write("上传成功".getBytes());
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                        //关流
                        closeAll(is, fos, os, s, ss);

                    }

                }
            }).start();
        }


    }
}
