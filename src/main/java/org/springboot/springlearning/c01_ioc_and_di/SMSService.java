package org.springboot.springlearning.c01_ioc_and_di;

import org.springframework.stereotype.Service;

@Service("sms-service")
public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("[SMS] Đang gửi thông báo: " + message);
    }
}
