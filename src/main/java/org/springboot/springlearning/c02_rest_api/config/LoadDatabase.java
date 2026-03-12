package org.springboot.springlearning.c02_rest_api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.springlearning.c02_rest_api.entities.Product;
import org.springboot.springlearning.c02_rest_api.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(ProductRepository repository) {
		
		return args -> {
			log.info("Preloading {}", repository.save(Product.builder()
					.name("IPhone17")
					.price(12000.0)
					.build()));
			log.info("Preloading {}", repository.save(Product.builder()
					.name("IPhone18")
					.price(20000.0)
					.build()));
		};
	}
}
