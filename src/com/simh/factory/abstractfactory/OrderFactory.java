package com.simh.factory.abstractfactory;

/**
 * @Author: 十七
 * @Date: 2022/8/26 11:38 AM
 * @Description: 工厂
 */
public interface OrderFactory {

    /**
     * 创建支付工厂
     * @return
     */
    APayFactory createPay();

    /**
     * 创建退款工厂
     * @return
     */
    ARefundFactory createRefund();

}
