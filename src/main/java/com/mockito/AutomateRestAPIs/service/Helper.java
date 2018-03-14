package com.mockito.AutomateRestAPIs.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public final class Helper {

	private int i;

	public Helper(int i) {
		this.i = i;
	}

	public int getMethods() {

		Random random = new Random();
		int num = random.nextInt();
		return num;
	}
}
