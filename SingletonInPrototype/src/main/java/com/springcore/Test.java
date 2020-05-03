package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.scan("com");
		ctx.refresh();

		UserService userService1 = ctx.getBean(UserService.class);
		UserService userService2 = ctx.getBean(UserService.class);
		System.out.println(userService1.getUserAddress().equals(userService2.getUserAddress()));

		ctx.close();
	}
}