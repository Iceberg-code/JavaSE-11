package cn.itcast.day11.demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
*       - public static <T> void sort(List<T> list, Comparator<? super T>)：将集合中元素按照指定规则排序。
*
* Comparator和Comparable的区别：
*       Comparable：自己(this)和被人(传递进来的参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
*       Comparator：相当于找一个第三方的裁判，比较两者
*
* Comparator的排序规则：
*       o1 - o2：升序
*       o2 - o1：降序
* */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(list1);   //[1, 3, 2]

        Collections.sort(list1, new Comparator<Integer>() { //匿名内部类
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return 0;

//                return o1 - o2; //升序
                return o2 - o1; //降序
            }
        });

        //升序：[1, 2, 3]
        //降序：[3, 2, 1]
        System.out.println(list1);
        System.out.println("===============");

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("源氏", 18));
        list2.add(new Student("半藏", 20));
        list2.add(new Student("路霸", 17));
        System.out.println(list2);  //[Student{name='源氏', age=18}, Student{name='半藏', age=20}, Student{name='路霸', age=17}]

        Collections.sort(list2, new Comparator<Student>() { //匿名内部类
            @Override
            public int compare(Student o1, Student o2) {
//                return 0;
                //按照年龄升序排序
//                return o1.getAge() - o2.getAge();
                //按年龄降序排序
                return o2.getAge() - o1.getAge();
            }
        });

        //按照年龄升序排序:[Student{name='路霸', age=17}, Student{name='源氏', age=18}, Student{name='半藏', age=20}]
        //按年龄降序排序：[Student{name='半藏', age=20}, Student{name='源氏', age=18}, Student{name='路霸', age=17}]
        System.out.println(list2);
        System.out.println("===============");

        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(new Student("a路霸", 18));
        list3.add(new Student("麦克雷", 20));
        list3.add(new Student("源氏", 17));
        list3.add(new Student("c源氏", 18));
        System.out.println(list3);
        Collections.sort(list3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return 0;
                //按照年龄升序排序
                int result = o1.getAge() - o2.getAge();
                //如果两个对象的年龄相同，在使用姓名的第一个字比较
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list3);
    }
}
