package com.factory.payment.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class CreditCard extends PaymentEntity implements Payment {
    public CreditCard() {
        this.setCommissionRate(0.03);
        this.setPost(10);
    }
    @Override
    public Double processPaymentCalculate(Double amount) {
        double finalAmount = amount + (amount * this.getCommissionRate());
        double finalPago = finalAmount > 1000 ? finalAmount + this.getPost() : finalAmount;
        this.setAmount(finalPago);
        return  finalPago;
    }

}
