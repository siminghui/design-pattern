package com.simh.factory.SimpleFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/25 10:53 AM
 * @Description: 工厂类
 */
public class SimplePayFactory {

    /**
     * 根据参数，返回对应的支付对象
     * @param payType
     * @return
     */
    public static Pay createPay(String payType) {
        if (payType == null) {
            return null;
        }
        if (payType.equalsIgnoreCase("WECHAT_PAY")) {
            return new WechatPay();
        } else if (payType.equalsIgnoreCase("ALI_PAY")) {
            return new AliPay();
        }

        // 想拓展，编写更多
        return null;

        /**
         * 简单工厂模式
         *
         * 又称静态工厂方法, 可以根据参数的不同返回不同类的实例，专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
         *
         * 由于工厂方法是静态方法，可通过类名直接调用，而且只需要传入简单的参数即可
         *
         *
         *
         * 核心组成
         *
         * Factory：工厂类，简单工厂模式的核心，它负责实现创建所有实例的内部逻辑
         * IProduct：抽象产品类，简单工厂模式所创建的所有对象的父类，描述所有实例所共有的公共接口
         * Product：具体产品类，是简单工厂模式的创建目标
         *
         *
         * 实现步骤
         *
         * 创建抽象产品类，里面有产品的抽象方法，由具体的产品类去实现
         * 创建具体产品类，继承了他们的父类，并实现具体方法
         * 创建工厂类，提供了一个静态方法createXXX用来生产产品，只需要传入你想产品名称
         *
         *
         *
         *
         * 优点：
         * 将对象的创建和对象本身业务处理分离可以降低系统的耦合度，使得两者修改起来都相对容易。
         * ----------------------------
         * 缺点
         * 工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，这一点与开闭原则是相违背
         * 即开闭原则（Open Close Principle）对扩展开放，对修改关闭，程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果
         * 将会增加系统中类的个数，在一定程度上增加了系统的复杂度和理解难度，不利于系统的扩展和维护，创建简单对象就不用模式
         */
    }

}
