package com.simh.factory;

import com.simh.factory.Pay;

/**
 * @Author: 十七
 * @Date: 2022/8/25 10:51 AM
 * @Description: 具体产品类 --> 阿里支付
 */
public class AliPay implements Pay {
    @Override
    public void unifiedOrder() {

        System.out.println("支付宝支付，统一下单接口");

    }
}
