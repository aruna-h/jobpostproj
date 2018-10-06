package com.bridgelabz.raisehire.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bridgelabz.raisehire")
public class MapConfig {

	@Bean
	public ModelMapper model() {
		return new ModelMapper();
	}
}