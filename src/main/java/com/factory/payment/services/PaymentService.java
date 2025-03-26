package com.factory.payment.services;

import com.factory.payment.domain.Payment;
import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.domain.factory.CreditCardFactory;
import com.factory.payment.domain.factory.DebitCardFactory;
import com.factory.payment.domain.factory.PaymentFactory;
import com.factory.payment.domain.factory.PaypalFactory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PaymentService {

    private PaymentFactory paymentFactory;


    public double processPayment(String paymentType, PaymentEntity payment) {
        configurationFactory(paymentType);
        Payment pago = paymentFactory.getPayment();
        return pago.processPayment(payment);
    }

    private void configurationFactory(String paymentType) {
        switch (paymentType.toLowerCase()){
            case "creditcard":
                paymentFactory = new CreditCardFactory();
                break;
            case "debitcard":
                paymentFactory = new DebitCardFactory();
                break;
            case "paypal":
                paymentFactory = new PaypalFactory();
                break;
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + paymentType);

        }
    }
}
