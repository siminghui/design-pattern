package com.simh.singleton;

/**
 * @Author: 十七
 * @Date: 2022/8/24 7:36 PM
 * @Description: 单例设计模式 - 饿汉实现方式
 */
public class SingletonHungry {

    /**
     * 饿汉方式：提前创建好对象 (类加载的时候把对象初始化)
     * 优点：实现简单，没有多线程同步问题
     * 缺点：不管有没使用，instance对象一直占着这段内存
     * -----------------------------------------
     * 如果对象不大，且创建不复杂，直接用饿汉的方式即可
     * 其他情况则采用懒汉实现方式
     */
    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry() {}

    public static SingletonHungry getInstance() {
        return instance;
    }

    /**
     * 单例对象的方法
     */
    public void process() {
        System.out.println("方法调用成功");
    }

}
