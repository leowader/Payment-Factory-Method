package com.factory.payment.domain.notification.factory;

import com.factory.payment.domain.notification.EmailNotification;
import com.factory.payment.domain.notification.INotification;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailFactory extends NotificationFactory{
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
