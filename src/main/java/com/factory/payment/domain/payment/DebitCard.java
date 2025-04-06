package com.factory.payment.domain.payment;

public class DebitCard extends PaymentEntity {
    public DebitCard() {
        this.setCommissionRate(0.01);
        this.setPost(5);
        this.setAmountCondition(500);
    }
}
