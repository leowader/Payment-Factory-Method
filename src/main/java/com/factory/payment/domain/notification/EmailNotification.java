package com.factory.payment.domain.notification;

import com.factory.payment.dtos.payment.DtoPaymentResponse;

public class EmailNotification implements INotification {
    @Override
    public String sendNotification(DtoPaymentResponse data) {
        return "Email ✉: "+data;
    }
}
