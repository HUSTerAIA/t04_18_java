package com.atguigu.upload1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CloseAll1 {
    //私有构造
    private CloseAll1() {

    }

    public static void closeAll(
            InputStream is, FileOutputStream fos, OutputStream os, Socket s, ServerSocket ss) {

        if (is != null) {
            try {
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (fos != null) {
            try {
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (is != null) {
            try {
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (s != null) {
            try {
                s.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ss != null) {
            try {
                ss.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
