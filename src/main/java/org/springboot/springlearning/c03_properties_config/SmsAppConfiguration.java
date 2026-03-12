package org.springboot.springlearning.c03_properties_config;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@EnableConfigurationProperties
@Configuration
public class SmsAppConfiguration {
	private final SmsAppProperties smsAppProperties;
	
	@Bean
	public CommandLineRunner run() {
		return args -> {
			System.out.println("--- BÀI TEST c03_properties_config ---");
			System.out.println("API Key: " + smsAppProperties.getApiKey());
			System.out.println("Sender ID: " + smsAppProperties.getSenderId());
		};
	}
}
