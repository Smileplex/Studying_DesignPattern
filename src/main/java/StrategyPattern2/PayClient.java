package StrategyPattern2;

public class PayClient {
    private PayStrategy payStrategy;

//    private void selectPaymentMethod(PaymentMethod method){
//        if(PaymentMethod.PAYPAL.equals(method)){
//            payStrategy = new
//        }else if(PaymentMethod.MONEY_TRANSFER.equals(method)){
//             payStrategy = new
//        }
//        Object object = new Object();
//    }
//    private void doPayment(Order order) {
//        order.processOrder(this.payStrategy);
//    }
//
//    public static void main(String[] args){
//        PayClient payClient = new PayClient();
//        payClient.selectPaymentMethod(PaymentMethod.PAYPAL);
//        //or
//        payClient.selectPaymentMethod(PaymentMethod.MONEY_TRANSFER);
//        payClient.doPayment(new Order());
//    }
}
