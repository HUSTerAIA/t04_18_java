package com.atguigu.stream1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {

//        foreach1();
//        System.out.println("-----------");
//        count1();
//        filter1();
//        limit1();
//        skip1();
//        concat1();
//        inver0();
//        distinct0();
        map0();

    }


    public static void foreach1() {
        //遍历
        Stream<String> stream1 = Stream.of("a", "b", "c");      // 针对数组的静态方法
/*        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });     //forEach是一个终结方法*/
        System.out.println("--------lambda------------");
        stream1.forEach((s) -> {        // 方法参数只有一个
            System.out.println(s);       // 方法体只有一句话

        });
    }

    /**
     * 统计元素个数
     */
    public static void count1() {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        long count = stream1.count();
        System.out.println("count = " + count);


    }

    /**
     * 过滤元素
     */
    public static void filter1() {
        Stream<String> stream1 = Stream.of("ab", "bwed", "c");
        Stream<String> newStream = stream1.filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 1;
                    }
                }
        );      //返回stream流
        newStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    /**
     * 获取前n个元素
     */
    public static void limit1() {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.limit(2).forEach(s -> System.out.println(s));
    }

    /**
     * 跳过前n个元素
     */
    public static void skip1() {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.skip(1).forEach(s -> System.out.println(s));
    }

    /**
     * 流合并
     */
    public static void concat1() {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("af", "bew", "ewc");
        Stream<String> concat1 = Stream.concat(stream1, stream2);
        concat1.forEach(s -> System.out.println(s));
    }

    /**
     * stream转换成集合
     */
    public static void inver0() {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        List<String> list0 = stream1.collect(Collectors.toList());      // 转成集合list
        System.out.println(list0);

    }

    /**
     * 去除重复
     */
    public static void distinct0() {
        Stream<String> stream1 = Stream.of("a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c");
        stream1.distinct().forEach(s -> System.out.println(s));
    }

    /**
     * 转换流中的数据类型
     */
    public static void map0() {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,4);
        stream1.map(new Function<Integer,String>() {
            @Override
            public String apply(Integer num) {
                return num+"";
            }
        }).forEach(s-> System.out.println(s+  1));
    }
}
