package com.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Employee getDisplay()
	{
		return new Employee();
	}
	@Bean
	public Address1 getshowAddress1()
	{
		return new Address1();
	}
}
