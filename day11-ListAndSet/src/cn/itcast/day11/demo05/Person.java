package cn.itcast.day11.demo05;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /*
    * 重写了compareTo方法（重写排序的规则）
    *
    * Comparable接口的排序规则：
    *       自己(this，就是调用方法的那个对象) - 传递进来的参数：升序
    *       传递进来的参数 - 自己(this)：降序
    * */
    //
    @Override
    public int compareTo(Person o) {
//        return 0;   //默认认为元素都是相同的

        //自定义比较的规则，比较两个人的年龄（this和参数Person）
//        return this.getAge() - o.getAge();  //按年龄升序排序    this - 参数
        return o.getAge() - this.getAge();  //按年龄降序排序      参数 - this
    }

}
