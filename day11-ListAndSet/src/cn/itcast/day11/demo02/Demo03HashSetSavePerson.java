package cn.itcast.day11.demo02;

import java.util.HashSet;

/*
* HashSet存储自定义类型元素
*
* Set集合保证元素唯一
*       存储的元素（String,Integer,...,Student,Person,...），必须重写HashCode方法和equals方法！！！
*
* 要求：同名同年龄的人，视为同一个人，只能存储一次
* */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("狂鼠", 18);
        Person p2 = new Person("狂鼠", 18);
        Person p3 = new Person("狂鼠", 19);

//        System.out.println(p1.hashCode());  //1967205423    未重写hashCode方法时
//        System.out.println(p2.hashCode());  //42121758      未重写hashCode方法时

        System.out.println(p1.hashCode());  //29496053    重写hashCode方法后
        System.out.println(p2.hashCode());  //29496053      重写hashCode方法后

        System.out.println(p1 == p2);   //false     重写和未重写hashCode、equals都为false
//        System.out.println(p2.equals(p1));  //false - 未重写equals方法时（equals方法默认比较两个对象的地址值）
        System.out.println(p2.equals(p1));  //false - 重写equals方法后

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);    //[Person{name='狂鼠', age=19}, Person{name='狂鼠', age=18}, Person{name='狂鼠', age=18}]
    }
}
