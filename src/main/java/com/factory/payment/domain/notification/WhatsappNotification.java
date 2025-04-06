package com.factory.payment.domain.notification;

import com.factory.payment.dtos.payment.DtoPaymentResponse;

public class WhatsappNotification implements INotification {
    @Override
    public String sendNotification(DtoPaymentResponse data) {
        return "Whatsapp : "+data;
    }
}
