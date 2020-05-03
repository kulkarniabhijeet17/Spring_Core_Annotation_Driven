package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.config.AppConfig;
import com.springcore.model.Entitlement;
import com.springcore.service.UserService;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(AppConfig.class);
		ctx.scan("com");
		ctx.refresh();

		// Singleton scope test
		Entitlement ent1 = ctx.getBean(Entitlement.class);
		Entitlement ent2 = ctx.getBean(Entitlement.class);
		ent1.setName("Anvi");
		ent2.setName("Snehal");
		System.out.println(ent1.getName());
		System.out.println(ent1.getName().equalsIgnoreCase(ent2.getName())); // Should be true

		// Prototype scope test
		UserService userService1 = ctx.getBean(UserService.class);
		UserService userService2 = ctx.getBean(UserService.class);
		userService1.setFirstName("Anvi");
		userService2.setFirstName("Snehal");
		System.out.println(userService1.getFirstName());
		System.out.println(userService1.getFirstName().equalsIgnoreCase(userService2.getFirstName())); // Should be false

		ctx.close();
	}
}