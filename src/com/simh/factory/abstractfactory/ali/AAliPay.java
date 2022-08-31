package com.simh.factory.abstractfactory.ali;

import com.simh.factory.abstractfactory.APayFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/25 10:51 AM
 * @Description: 具体产品类 --> 阿里支付
 */
public class AAliPay implements APayFactory {
    @Override
    public void unifiedOrder() {

        System.out.println("抽象工厂 --> 支付宝支付，统一下单接口");

    }
}
