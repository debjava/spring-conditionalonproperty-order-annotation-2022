package com.ddlab.rnd.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ddlab.rnd.service.NotificationSender;
import com.ddlab.rnd.service.impl.EmailNotification;
import com.ddlab.rnd.service.impl.SmsNotification;

@Configuration
public class NotificationConfig {

    @Bean(name = "emailNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "email")
    public NotificationSender emailNotificationSender() {
        return new EmailNotification();
    }

    @Bean(name = "smsNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "sms")
    public NotificationSender smsNotificationSender() {
        return new SmsNotification();
    }

}