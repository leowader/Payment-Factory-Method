package com.factory.payment.domain.notification;

import com.factory.payment.dtos.payment.DtoPaymentResponse;

public interface INotification {
    String sendNotification(DtoPaymentResponse data);
}
