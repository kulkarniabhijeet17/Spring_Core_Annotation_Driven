package com.springcore.model;

public class Entitlement {
	public Entitlement() {
		System.out.println("Calling Entitlement: singleton scope constructor");
	}

	private String name;
	private int time;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}