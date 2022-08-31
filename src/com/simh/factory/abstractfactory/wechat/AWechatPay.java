package com.simh.factory.abstractfactory.wechat;

import com.simh.factory.Pay;
import com.simh.factory.abstractfactory.APayFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/25 10:51 AM
 * @Description: 具体产品类 --> 微信支付
 */
public class AWechatPay implements APayFactory {
    @Override
    public void unifiedOrder() {

        System.out.println("抽象工厂 --> 微信支付，统一下单接口");

    }
}
