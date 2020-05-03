package com.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class AddressService {
	public AddressService() {
		System.out.println("Calling AddressService: prototype scope constructor");
	}
}