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
        System.out.println("PROCESANDO PAGO CON TARJETA DE CREDITO");
        double finalAmount = amount + (amount * this.getCommissionRate());
        double finalPago = finalAmount > 1000 ? finalAmount + this.getPost() : finalAmount;
        this.setAmount(finalPago);
        return  finalPago;
    }

}
