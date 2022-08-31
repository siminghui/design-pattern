package com.simh.factory.FactoryMethod;

import com.simh.factory.AliPay;
import com.simh.factory.Pay;

/**
 * @Author: 十七
 * @Date: 2022/8/25 11:14 AM
 * @Description: 具体的工厂实现
 */
public class AliPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
