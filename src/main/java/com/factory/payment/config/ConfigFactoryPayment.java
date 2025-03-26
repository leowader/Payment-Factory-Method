package com.factory.payment.config;

import com.factory.payment.domain.factory.CreditCardFactory;
import com.factory.payment.domain.factory.DebitCardFactory;
import com.factory.payment.domain.factory.PaymentFactory;
import com.factory.payment.domain.factory.PaypalFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class ConfigFactoryPayment {
    private PaymentFactory paymentFactory;

    public PaymentFactory configurationFactory(String paymentType) {
        switch (paymentType.toLowerCase()) {
            case "creditcard":
                paymentFactory = new CreditCardFactory();
                return paymentFactory;
            case "debitcard":
                paymentFactory = new DebitCardFactory();
                return paymentFactory;

            case "paypal":
                paymentFactory = new PaypalFactory();
                return paymentFactory;
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + paymentType);

        }
    }

}
