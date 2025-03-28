package com.factory.payment.services;

import com.factory.payment.config.ConfigFactoryPayment;
import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.domain.factory.PaymentFactory;
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

    public double processPayment(String paymentType, double amount) {
        PaymentFactory pay = configFactoryPayment.configurationFactory(paymentType);
        PaymentEntity pago = pay.getPayment();
        return pago.calculateAmount(amount, pago.getCommissionRate(), pago.getPost(), pago.getAmountCondition());
    }
}
