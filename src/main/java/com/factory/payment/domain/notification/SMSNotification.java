package com.factory.payment.domain.notification;

import com.factory.payment.dtos.payment.DtoPaymentResponse;

public class SMSNotification implements INotification {
    @Override
    public String sendNotification(DtoPaymentResponse data) {
        return "SMS: "+data;
    }
}
