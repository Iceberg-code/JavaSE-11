package cn.itcast.day11.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* java.util.List 接口继承(extends)了Collection接口
* List接口的特点：
*       1、有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
*       2、有索引，包含了一些带索引的方法
*       3、允许存储重复的元素
*
* List接口带索引的方法（特有）
*       - public void add(int index, E element)：将指定的元素，添加到该集合中的指定位置上
*       - public E get(int index)：返回集合中指定位置的元素
*       - public E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素
*       - public E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回值的更新前元素
*
* 注意：操作索引的时候，一定要防止索引越界异常
*       IndexOutOfBoundsException：索引越界异常，集合会报
*       ArrayIndexOutOfBoundsException：数组索引越界异常
*       StringIndexOutOfBoundsException：字符串索引越界异常
* */
public class Demo01List {
    public static void main(String[] args) {
        //创建List结合，使用多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("狂鼠");
        list.add("源氏");
        list.add("半藏");
        list.add("安娜");
        list.add("狂鼠");
        //打印集合
        System.out.println(list);   //[狂鼠, 源氏, 半藏, 安娜, 狂鼠] - 打印的不是地址，重写了toString方法
        System.out.println("==================");

        //public void add(int index, E element)：将指定的元素，添加到该集合中的指定位置上
        //在半藏和安娜之间添加一个麦克雷
        list.add(3, "麦克雷");
        System.out.println(list);   //[狂鼠, 源氏, 半藏, 麦克雷, 安娜, 狂鼠]
        System.out.println("==================");

        //public E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素
        //移除元素：半藏
        String removeElement = list.remove(2);
        System.out.println("被移除的元素：" + removeElement);  //半藏
        System.out.println(list);   //[狂鼠, 源氏, 麦克雷, 安娜, 狂鼠]
        System.out.println("==================");

        //public E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回值的更新前元素
        //把安娜替换为路霸
        String s = list.set(3, "路霸");
        System.out.println("被替换的元素：" + s);  //安娜
        System.out.println(list);   //[狂鼠, 源氏, 麦克雷, 路霸, 狂鼠]

        //List集合遍历有有三种方式
        //使用普通的for循环
        for(int i = 0; i < list.size(); i++){
            //public E get(int index)：返回集合中指定位置的元素
            System.out.print(list.get(i) + " ");    //狂鼠 源氏 麦克雷 路霸 狂鼠
        }
        System.out.println("\n" + "==================");

        //使用迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.print(next + " ");   //狂鼠 源氏 麦克雷 路霸 狂鼠
        }
        System.out.println("\n" + "==================");

        //使用增强for遍历     快捷键：list.for
        for (String s1 : list) {
            System.out.print(s1 + " "); //狂鼠 源氏 麦克雷 路霸 狂鼠
        }

//        System.out.println(list.get(5));    //IndexOutOfBoundsException - 索引越界异常
    }
}
