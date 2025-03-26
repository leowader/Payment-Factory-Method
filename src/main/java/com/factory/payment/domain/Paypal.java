package com.factory.payment.domain;

public class Paypal extends PaymentEntity implements Payment {

    public Paypal() {
        this.setCommissionRate(0.02);
        this.setPost(7);
    }

    @Override
    public Double processPaymentCalculate(Double amount) {
        double finalAmount = amount + (amount * this.getCommissionRate());
        return finalAmount > 750 ? finalAmount + this.getPost() : finalAmount;
    }

}
