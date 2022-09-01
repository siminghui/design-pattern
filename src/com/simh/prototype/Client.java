package com.simh.prototype;

/**
 * @Author: 十七
 * @Date: 2022/8/31 4:05 PM
 * @Description: 调用方 浅拷贝
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型模式
        Person person1 = new Person();
        person1.setAge(10);
        person1.setName("Lynn");
        person1.getList().add("aaa");

        // 浅拷贝
        //Person person2 = person1.clone();

        // 深拷贝
        Person person2 = (Person) person1.deepClone();
        person2.setName("shiqi");
        person2.getList().add("bbb");

        System.out.println("person1="+person1.getName()+", age="+person1.getAge()+", list="+person1.getList());
        System.out.println("person2="+person2.getName()+", age="+person2.getAge()+", list="+person2.getList());
    }

}
