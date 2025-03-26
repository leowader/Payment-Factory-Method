package com.factory.payment.services;

import com.factory.payment.domain.PaymentEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    public String processPayment(String paymentType, PaymentEntity payment) {
        System.out.println("---Info pago:" + paymentType);
        return "Procesando pago..." + paymentType;
    }
}
