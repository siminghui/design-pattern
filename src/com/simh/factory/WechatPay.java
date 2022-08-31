package com.simh.factory;

import com.simh.factory.Pay;

/**
 * @Author: 十七
 * @Date: 2022/8/25 10:51 AM
 * @Description: 具体产品类 --> 微信支付
 */
public class WechatPay implements Pay {
    @Override
    public void unifiedOrder() {

        System.out.println("微信支付，统一下单接口");

    }
}
