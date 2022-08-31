import com.simh.factory.FactoryMethod.AliPayFactory;
import com.simh.factory.FactoryMethod.PayFactory;
import com.simh.factory.FactoryMethod.WeChatPayFactory;
import com.simh.factory.Pay;
import com.simh.factory.SimpleFactory.SimplePayFactory;
import com.simh.factory.abstractfactory.APayFactory;
import com.simh.factory.abstractfactory.FactoryProducter;
import com.simh.factory.abstractfactory.OrderFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // 简单工厂
        //Pay wechat_pay = SimplePayFactory.createPay("wechat_pay");
        //wechat_pay.unifiedOrder();

        //Pay ali_pay = SimplePayFactory.createPay("ali_pay");
        //ali_pay.unifiedOrder();

        // 工厂 方法模式
        //PayFactory aliPayFactory = new AliPayFactory();
        //Pay aliPay = aliPayFactory.getPay();
        //aliPay.unifiedOrder();
        //
        //PayFactory weChatPayFactory = new WeChatPayFactory();
        //Pay weChatPay = weChatPayFactory.getPay();
        //weChatPay.unifiedOrder();

        // 抽象工厂模式
        OrderFactory wechat = FactoryProducter.getFactory("wechat");
        wechat.createPay().unifiedOrder();
        wechat.createRefund().refund();

    }

}
