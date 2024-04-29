package com.atguigu.ioutils1;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class IOUtils1 {
    public static void main(String[] args) throws IOException {
        //文件复制
        IOUtils.copy(new FileInputStream("io\\1.txt"),new FileOutputStream("io\\1_copys.txt"));
        //静默释放
        FileWriter fw=null;
        try{
            fw=new FileWriter("io\\10.txt");
            fw.write("测试");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fw!=null){
                IOUtils.closeQuietly(fw);
            }
        }

    }
}
