package com.atguigu.lombok1;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person1 {
    private String name;
    private int age;
}
