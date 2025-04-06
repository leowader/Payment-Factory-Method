package com.factory.payment.domain.notification.factory;

import com.factory.payment.domain.notification.INotification;
import com.factory.payment.domain.notification.SMSNotification;

public class SMSFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new SMSNotification();
    }
}
