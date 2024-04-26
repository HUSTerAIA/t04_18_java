package com.atguigu.math1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Math3 {
    public static void main(String[] args) {
        //BigDecimal(String val)    ->val必须wield数字形式
        BigDecimal b1=new BigDecimal("6734.34");

        //static BigDecima1 valueof(doub1eva1)->此方法初始化小数时可以传入doub1e型数
        BigDecimal b2=BigDecimal.valueOf(3764.35);
        //BigDecimal add(BigDecimal val)    //返回其值为(this+val)的BigDecimal
        System.out.println(b1.add(b2));
        //BigDecimal subtract(BigDecimal val)    //返回其值为(this-val)的BigDecimal
        System.out.println(b1.subtract(b2));
        //BigDecimal multiply(BigDecimal val)    //返回其值为(this*va1)的BigDecimal
        System.out.println(b1.multiply(b2));
        //BigDecimal divide(BigDecimal val)    //返回其值为(this/va1)的BigDecimal

        System.out.println(b1.divide(b2,5,BigDecimal.ROUND_HALF_UP));
        //BigDecimal divide(BigDecimal divisor,int scale,int roundingMode)
        BigDecimal b3=b1.divide(b2,5,BigDecimal.ROUND_HALF_UP);
        System.out.println(b3.doubleValue());

        System.out.println(b1.divide(b2,5, RoundingMode.FLOOR));
    }
}
