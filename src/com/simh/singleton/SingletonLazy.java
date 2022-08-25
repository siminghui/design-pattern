package com.simh.singleton;

/**
 * @Author: 十七
 * @Date: 2022/8/23 5:38 PM
 * @Description: 单例设计模式 - 懒汉实现方式
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    /**
     * 构造函数私有化
     */
    private SingletonLazy() {}


    /**
     * 单例对象的方法
     */
    public void process() {
        System.out.println("方法调用成功");
    }

    /**
     * 第一种方式
     * 对外暴露一个方法获取类对象
     *
     * 线程不安全，多线程下存在安全问题
     * @return
     */
    public static SingletonLazy get1Instance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * 第二种方式
     * 通过加锁 synchronized 保证单例
     *
     * 采用synchronized 对方法加锁有很大的性能开销
     *
     * 解决方法，锁力度减小
     *
     * 这里补充一点synchronized的知识：
     * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种：
     * 1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象；
     * 2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象；
     * 3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象；
     * 4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用的对象是这个类的所有对象。
     * ————————————————
     *
     * 总结：
     * A. 无论synchronized关键字加在方法上还是对象上，如果它作用的对象是非静态的，则它取得的锁是对象；如果synchronized作用的对象是一个静态方法或一个类，则它取得的锁是对类，该类所有的对象同一把锁。
     * B. 每个对象只有一个锁（lock）与之相关联，谁拿到这个锁谁就可以运行它所控制的那段代码。
     * C. 实现同步是要很大的系统开销作为代价的，甚至可能造成死锁，所以尽量避免无谓的同步控制。
     * ————————————————
     *
     * @return
     */
    public static synchronized SingletonLazy get2Instance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * 第三种实现方式
     * @return
     */
    public static SingletonLazy get3Instance() {
        if (instance == null) {
            synchronized(SingletonLazy.class)  {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }

    /**
     * DCL双重检查锁定(double-checked-locking) 在多线程情况下保持高性能
     *
     * 这个是否安全， instance = new SingletonLazy(); 不是原子操作
     * 宏观来看创建对象的过程
     * 1. 分配空间给对象
     * 2. 在空间内创建对象
     * 3. 将对象（内存的空间地址）赋值给引用 instance
     *
     * 假如 1->3->2 顺序，会把值写回主内存，其他线程就会读取到instance最新的值，但是这个是不完全的对象
     * （指令重排）
     *
     * @return
     */
    public static SingletonLazy get4Instance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    /**
     * volatile是Java提供的关键字，它具有可见性和有序性，
     *
     * 指令重排序是JVM对语句执行的优化，只要语句间没有依赖，那JVM就有权对语句进行优化
     *
     * 禁止了指令重排
     *
     * Volatile关键字的作用主要有如下两个：（但不保证原子性）
     * 1.线程的可见性：当一个线程修改一个共享变量时，另外一个线程能读到这个修改的值。
     * 2. 顺序一致性：禁止指令重排序。
     */
    private static volatile SingletonLazy instance2;
    public static SingletonLazy getInstance() {
        //第一重检查
        if(instance2 == null){
            // A、B ，锁定
            synchronized (SingletonLazy.class){
                //第二重检查
                if(instance2 == null) {
                    instance2 = new SingletonLazy();
                }
            }
        }
        return instance2;
    }
}
