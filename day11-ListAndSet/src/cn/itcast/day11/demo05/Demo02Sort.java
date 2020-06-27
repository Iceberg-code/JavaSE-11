package cn.itcast.day11.demo05;

import java.util.ArrayList;
import java.util.Collections;

/*
* java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
*       - public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序
* 注意事项：
*   sort(List<T> list)使用前提：
*       被排序的集合里面存储的元素，必须实现Comparable接口，重写Comparable接口中compareTo方法（定义排序的规则）
*
* Comparable接口的排序规则：
*       自己(this，就是调用方法的那个对象) - 传递进来的参数：升序
*       传递进来的参数 - 自己(this)：降序
* */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(list1);   //[1, 3, 2]

        //public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序
        //注意参数只能传List集合，不能传Set集合
        //注意是静态方法
        Collections.sort(list1); //默认是升序
        System.out.println(list1);   //[1, 2, 3]
        System.out.println("==================");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        System.out.println(list2);  //[a, c, b]
        Collections.sort(list2);
        System.out.println(list2);  //[a, b, c]
        System.out.println("==================");

        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("源氏", 1));
        list3.add(new Person("半藏", 3));
        list3.add(new Person("路霸", 2));
        System.out.println(list3);  //[Person{name='源氏', age=1}, Person{name='半藏', age=3}, Person{name='路霸', age=2}]
//        Collections.sort(list3);  //代码编译报错

        //在Person类中重写了Comparable接口中compareTo方法
        Collections.sort(list3);

        //按年龄升序排序时：[Person{name='源氏', age=1}, Person{name='路霸', age=2}, Person{name='半藏', age=3}]
        //按年龄降序排序时：[Person{name='半藏', age=3}, Person{name='路霸', age=2}, Person{name='源氏', age=1}]
        System.out.println(list3);
    }
}
