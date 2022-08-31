package com.simh.factory.FactoryMethod;

import com.simh.factory.Pay;
import com.simh.factory.WechatPay;

/**
 * @Author: 十七
 * @Date: 2022/8/25 11:15 AM
 * @Description: 具体的工厂实现
 */
public class WeChatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}
