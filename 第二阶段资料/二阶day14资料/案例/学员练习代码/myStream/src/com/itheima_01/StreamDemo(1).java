package com.itheima_01;

import java.util.ArrayList;

/*
    需求：按照下面的要求完成集合的创建和遍历
        1:创建一个集合，存储多个字符串元素
        2:把集合中所有以"张"开头的元素存储到一个新的集合
        3:把"张"开头的集合中的长度为3的元素存储到一个新的集合
        4:遍历上一步得到的集合
 */
public class StreamDemo {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

    }
}
