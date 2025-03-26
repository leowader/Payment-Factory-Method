package com.factory.payment.domain;

import com.factory.payment.domain.factory.CreditCardFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
