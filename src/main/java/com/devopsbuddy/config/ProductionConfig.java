package com.devopsbuddy.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;
import com.devopsbuddy.backend.service.SmtpEmailService;

@Configuration
@Profile("prod")
@PropertySource("classpath:application-prod.properties")
public class ProductionConfig {

	private static final Logger LOG = LoggerFactory.getLogger(ProductionConfig.class);
	
	public ProductionConfig() {
		LOG.debug("created");
	}
	
	@Bean
	public EmailService getEmailService() {
		return new SmtpEmailService();
	}
	
}
