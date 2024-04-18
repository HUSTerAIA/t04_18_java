package com.atguigu.student_manage;

public class ArrayUtils {
    /**
     * 工具类，静态成员
     */

    public static int findIndex(Student[] students, int count, int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
