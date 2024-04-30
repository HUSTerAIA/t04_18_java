package com.atguigu.new_chara01;

import java.io.FileWriter;
import java.io.IOException;

public class Test0 {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("io\\11.txt");
        try(fw){
            fw.write("你好");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
