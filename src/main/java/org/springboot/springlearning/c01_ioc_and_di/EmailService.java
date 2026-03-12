package org.springboot.springlearning.c01_ioc_and_di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email-service")
@Primary // Nếu không dùng @Quatifier trong constructor, thì đánh dấu EmailService với @Primary là bean ưu tiên khi có nhiều bean cùng loại
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("[EMAIL] Đang gửi thông báo: " + message);
    }
}