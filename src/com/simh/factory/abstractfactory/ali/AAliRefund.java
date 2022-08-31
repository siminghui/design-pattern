package com.simh.factory.abstractfactory.ali;

import com.simh.factory.abstractfactory.ARefundFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/26 11:43 AM
 * @Description:
 */
public class AAliRefund implements ARefundFactory {
    @Override
    public void refund() {
        System.out.println("抽象工厂 --> 支付宝退款接口");
    }
}
