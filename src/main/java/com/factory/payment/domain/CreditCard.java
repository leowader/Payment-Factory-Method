package com.factory.payment.domain;




public class CreditCard extends PaymentEntity implements Payment {
    public CreditCard (){
        this.setCommissionRate(0.01);
        this.setPost(5);
    }
    @Override
    public Double processPayment(PaymentEntity payment) {
        System.out.println("PROCESANDO PAGO CON TARJETA DE CREDITO");
        return 0.0;
    }

}
