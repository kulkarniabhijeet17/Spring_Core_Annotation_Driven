package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	public UserService() {
		System.out.println("Calling UserService: singleton scope constructor");
	}

	@Autowired
	private AddressService addressService;

	public AddressService getUserAddress() {
		return addressService;
	}
}