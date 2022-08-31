package com.simh.factory.abstractfactory.ali;

import com.simh.factory.abstractfactory.APayFactory;
import com.simh.factory.abstractfactory.ARefundFactory;
import com.simh.factory.abstractfactory.OrderFactory;

/**
 * @Author: 十七
 * @Date: 2022/8/26 11:41 AM
 * @Description:
 */
public class AAliOrderFactory implements OrderFactory {

    @Override
    public APayFactory createPay() {
        return new AAliPay();
    }

    @Override
    public ARefundFactory createRefund() {
        return new AAliRefund();
    }
}
