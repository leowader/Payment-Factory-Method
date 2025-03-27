package com.factory.payment.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class DebitCart extends PaymentEntity implements Payment {
    public DebitCart() {
        this.setCommissionRate(0.01);
        this.setPost(5);
    }

    @Override
    public Double processPaymentCalculate(Double amount) {
        double finalAmount = amount + (amount * this.getCommissionRate());
        return finalAmount > 500 ? finalAmount + this.getPost() : finalAmount;
    }


}
