package cn.itcast.day11.demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* java.util.LinkedHashSet集合 继承了(extends) HashSet集合
* LinkedHashSet集合的特点：
*       底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
* */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("源氏");
        set.add("狂鼠");
        set.add("狂鼠");
        set.add("半藏");
        System.out.println(set);    //[狂鼠, 源氏, 半藏] - 无序，不允许重复
        System.out.println("==============");

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("源氏");
        linked.add("狂鼠");
        linked.add("狂鼠");
        linked.add("半藏");
        System.out.println(linked); //[源氏, 狂鼠, 半藏] - 有序，不允许重复
    }
}
