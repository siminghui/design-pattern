package com.simh.factory.abstractfactory.wechat;

import com.simh.factory.abstractfactory.ARefundFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/26 11:47 AM
 * @Description:
 */
public class AWechatRefund implements ARefundFactory {
    @Override
    public void refund() {
        System.out.println("抽象工厂 --> 微信退款接口");
    }
}
