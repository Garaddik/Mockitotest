package com.mockito.AutomateRestAPIs.service;

import org.springframework.stereotype.Service;

@Service
public final class Business {

	public Helper helper;
	
	public int randomSum() {

		helper = new Helper(1);

		int a = helper.getMethods();

		return a + a;
	}
}
