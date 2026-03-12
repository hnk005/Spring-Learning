package org.springboot.springlearning.c04_data_jpa;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class TestConfiguration {
	
	private final AccountRes accountRes;
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountRes accountRes) {
		return args -> {
			accountRes.findAll().forEach(System.out::println);
		};
	}
}
