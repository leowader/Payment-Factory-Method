package com.factory.payment.domain;


public class CreditCard extends PaymentEntity {

    public CreditCard() {
        this.setCommissionRate(0.03);
        this.setPost(10);
        this.setAmountCondition(1000);
    }
}
