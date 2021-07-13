package net.xdclass.prototype;

public class Client {

    public static void main(String [] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setAge(10);
        person1.setName("小滴课堂-老王");
        person1.getList().add("aaa");

        //浅拷贝内存地址是一样的
//        Person person2 = person1.clone();
//        person2.setName("Anna小姐姐");
//        person2.getList().add("ccc");
        //深拷贝-内存地址是不一样的
        Person person2 = (Person) person1.deepClone();
        person2.setName("Anna小姐姐");
        person2.getList().add("ccc");

        System.out.println("person1="+person1.getName()+", age="+person1.getAge());
        System.out.println("person2="+person2.getName()+", age="+person2.getAge());

    }
}
