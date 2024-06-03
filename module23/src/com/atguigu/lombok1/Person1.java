package com.atguigu.lombok1;

import lombok.*;


/**
 * lombok简化代码
 */
@Data       // 生成get,set,tostring,hashcode,equals,无参构造
@NoArgsConstructor      // 无参构造
@AllArgsConstructor     // 有参构造

public class Person1 {
    private String name;
    private int age;
}
