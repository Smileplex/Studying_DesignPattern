package StrategyPattern2;

public class PayClient {
    private PayStrategy payStrategy;
    private Order order;

    private void doPayment(Order order, PaymentMethod method) {
        PayStrategy strategy;

        if(PaymentMethod.PAYPAL.equals(method)){
            // strategy = new [ ]
        }else if(PaymentMethod.MONEY_TRANSFER.equals(method)){
            // strategy = new [ ]
        }
    }

    public static void main(String[] args){
        PayClient payClient = new PayClient();
        payClient.doPayment(new Order(), PaymentMethod.PAYPAL);
    }
}
