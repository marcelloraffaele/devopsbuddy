package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource rbms = new ReloadableResourceBundleMessageSource();
		rbms.setBasename("classpath:i18n/messages");
		//update every 30 minutes
		rbms.setCacheSeconds(1800);
		return rbms;
	}
	
}
