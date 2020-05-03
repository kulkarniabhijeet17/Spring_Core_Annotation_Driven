package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class UserService {
	public UserService() {
		System.out.println("Calling UserService: prototype scope constructor");
	}

	@Autowired
	private AddressService addressService;

	public AddressService getUserAddress() {
		return addressService;
	}
}