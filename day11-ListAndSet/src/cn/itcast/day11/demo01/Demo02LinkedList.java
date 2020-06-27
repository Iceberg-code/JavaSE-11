package cn.itcast.day11.demo01;


import java.util.LinkedList;

/*
* java.util.LinkedList集合implements List接口（是List接口的一个实现类）
* LinkedList集合的特点：
*       1、底层是一个链表结构（双向链表）：查询慢，增删块
*       2、里面包含了大量操作首位元素的方法
*       注意：使用LinkedList集合特有的方法，不能使用多态
*
*       - public void addFirst(E e) ：将指定元素插入此列表开头
*       - public void addLast(E e)：将指定元素添加到此列表结尾
*       - public void push(E e)：将元素推入此列表所表示的堆栈。此方法等效于addFirst
*
*       - public E getFirst()：返回此列表的第一个元素
*       - public E getLast()：返回此列表的最后一个元素
*
*       - public E removeFirst()：移除并返回此列表的第一个元素
*       - public E removeLast()：移除并返回此列表的最后一个元素
*       - public E pop()：从此列表所表示的堆栈弹出一个元素
*
*       - public boolean isEmpty()：如果列表不包含元素，则返回true
* */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        System.out.println("=============");
        show02();
        System.out.println("=============");
        show03();
    }

    /*
     * public void addFirst(E e) ：将指定元素插入此列表开头
     * public void addLast(E e)：将指定元素添加到此列表结尾。此方法等效于add方法
     * public void push(E e)：将元素推入此列表所表示的堆栈。此方法等效于addFirst
     * */
    private static void show01() {
        //创建LinkedList集合
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("狂鼠");
        linked.add("源氏");
        linked.add("半藏");
        System.out.println(linked); //[狂鼠, 源氏, 半藏]

        //public void addFirst(E e) ：将指定元素插入此列表开头
        linked.addFirst("路霸");
        System.out.println(linked); //[路霸, 狂鼠, 源氏, 半藏]

        //public void push(E e)：将元素推入此列表所表示的堆栈。此方法等效于addFirst
        linked.push("麦克雷");
        System.out.println(linked); //[麦克雷, 路霸, 狂鼠, 源氏, 半藏]

        //public void addLast(E e)：将指定元素添加到此列表结尾。此方法等效于add方法
        linked.addLast("安娜");
        System.out.println(linked); //[麦克雷, 路霸, 狂鼠, 源氏, 半藏, 安娜]
    }

    /*
    * public E getFirst()：返回此列表的第一个元素
    * public E getLast()：返回此列表的最后一个元素
    * */
    private static void show02(){
        //创建LinkedList集合
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("狂鼠");
        linked.add("源氏");
        linked.add("半藏");

        linked.clear(); //清空集合中的元素，再获取集合中的元素会抛出NoSuchElementException

        //public boolean isEmpty()：如果列表不包含元素，则返回true
        if(! linked.isEmpty()){
            //public E getFirst()：返回此列表的第一个元素
            String first = linked.getFirst();
            System.out.println(first);  //狂鼠

            //public E getLast()：返回此列表的最后一个元素
            String last = linked.getLast();
            System.out.println(last);   //半藏
        }


        /*
        * public E removeFirst()：移除并返回此列表的第一个元素
        * public E removeLast()：移除并返回此列表的最后一个元素
        * public E pop()：从此列表所表示的堆栈弹出一个元素。此方法相当于removeFirst方法
        * */
//
    }
    private static void show03(){
        //创建LinkedList集合
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("狂鼠");
        linked.add("源氏");
        linked.add("半藏");

        String first = linked.removeFirst();
        System.out.println("被移除的第一个元素：" + first);  //狂鼠
        String last = linked.removeLast();
        System.out.println("被移除的最后一个元素：" + last);   //半藏
        System.out.println(linked); //[源氏]
        System.out.println("------------------");

        String pop = linked.pop();
        System.out.println(pop);    //源氏
        System.out.println(linked); //[]
    }
}
