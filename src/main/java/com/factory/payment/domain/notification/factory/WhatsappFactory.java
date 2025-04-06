package com.factory.payment.domain.notification.factory;

import com.factory.payment.domain.notification.INotification;
import com.factory.payment.domain.notification.WhatsappNotification;

public class WhatsappFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new WhatsappNotification();
    }
}
