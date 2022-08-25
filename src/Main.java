import com.simh.factory.SimpleFactory.Pay;
import com.simh.factory.SimpleFactory.SimplePayFactory;

public class Main {

    public static void main(String[] args) {
        //Pay wechat_pay = SimplePayFactory.createPay("wechat_pay");
        //wechat_pay.unifiedOrder();

        Pay ali_pay = SimplePayFactory.createPay("ali_pay");
        ali_pay.unifiedOrder();
    }

}
