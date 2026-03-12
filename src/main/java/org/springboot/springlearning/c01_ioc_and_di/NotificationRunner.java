package org.springboot.springlearning.c01_ioc_and_di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationRunner implements CommandLineRunner {

    private final MessageService emailService;
    private final MessageService smsService;


    public NotificationRunner(@Qualifier("email-service") MessageService emailService, @Qualifier("sms-service") MessageService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- BÀI TEST c01_ioc_and_di ---");
        emailService.sendMessage("Chào bạn, đây là thông báo từ EmailService!");
        smsService.sendMessage("Chào bạn, đây là thông báo từ SMSService!");
    }
}