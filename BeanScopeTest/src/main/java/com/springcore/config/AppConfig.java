package com.springcore.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springcore.model.Entitlement;

@Configuration
public class AppConfig {
	@Bean(name = "entitlement")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Entitlement entitlement() {
		Entitlement ent = new Entitlement();
		ent.setName("Abhijeet");
		ent.setTime(30);
		return ent;
	}
}