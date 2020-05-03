package com.springcore;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
	public AddressService() {
		System.out.println("Calling AddressService: singleton scope constructor");
	}
}