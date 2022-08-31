package com.simh.factory.abstractfactory.wechat;

import com.simh.factory.abstractfactory.APayFactory;
import com.simh.factory.abstractfactory.ARefundFactory;
import com.simh.factory.abstractfactory.OrderFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/26 11:46 AM
 * @Description:
 */
public class AWechatOrderFactory implements OrderFactory {
    @Override
    public APayFactory createPay() {
        return new AWechatPay();
    }

    @Override
    public ARefundFactory createRefund() {
        return new AWechatRefund();
    }
}
