package com.simh.factory.abstractfactory;

import com.simh.factory.abstractfactory.ali.AAliOrderFactory;
import com.simh.factory.abstractfactory.wechat.AWechatOrderFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/26 11:49 AM
 * @Description: 超级工厂创造器
 */
public class FactoryProducter {

    public static OrderFactory getFactory(String type) {

        if (type.equalsIgnoreCase("WECHAT")){
            return new AWechatOrderFactory();
        } else if (type.equalsIgnoreCase("ALI")) {
            return new AAliOrderFactory();
        }

        return null;
    }

}
