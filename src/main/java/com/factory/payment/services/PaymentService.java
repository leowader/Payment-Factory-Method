package com.factory.payment.services;

import com.factory.payment.config.ConfigFactoryPayment;
import com.factory.payment.domain.Payment;
import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.domain.factory.CreditCardFactory;
import com.factory.payment.domain.factory.DebitCardFactory;
import com.factory.payment.domain.factory.PaymentFactory;
import com.factory.payment.domain.factory.PaypalFactory;
import com.factory.payment.dtos.PaymentResponseDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PaymentService {
    @Autowired
    private ConfigFactoryPayment configFactoryPayment;

    public Payment processPayment(String paymentType, double amount) {
        PaymentFactory pay= configFactoryPayment.configurationFactory(paymentType);
        Payment pago = pay.getPayment();
        pago.processPaymentCalculate(amount);


        return pago;
    }
}
