package com.factory.payment.domain.payment;

public class Paypal extends PaymentEntity {

    public Paypal() {
        this.setCommissionRate(0.02);
        this.setPost(7);
        this.setAmountCondition(750);
    }
}
