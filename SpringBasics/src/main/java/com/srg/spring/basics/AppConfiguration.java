package com.srg.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.srg.spring.basics.primary.Addition;
import com.srg.spring.basics.primary.CalculationService;
import com.srg.spring.basics.primary.Substraction;

@Configuration
public class AppConfiguration {

	@Bean
	ConfigurationDemoBean getConfigurationBean() {
	 return new ConfigurationDemoBean();	
	}
	
	@Bean
	public CalculationService getAddition() {
		return new Addition();
	}
	
	@Bean
	public CalculationService getSubstraction() {
		return new Substraction();
	}
}
