package com.atguigu.static3;

public class ArraysUtils {
    /*

    工具类中的成员均为静态，类名.成员直接调用，不同new对象；
    因此构造方法用private修饰
     */
    private ArraysUtils() {

    }

    //定义一个方法，取int数组最大值
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
