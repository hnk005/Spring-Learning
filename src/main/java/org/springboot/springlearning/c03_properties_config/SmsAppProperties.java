package org.springboot.springlearning.c03_properties_config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component
@ConfigurationProperties(prefix = "vnsms")
@Validated
public class SmsAppProperties {
	private String apiKey;
	
	private String senderId;
}
