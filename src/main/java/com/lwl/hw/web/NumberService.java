package com.lwl.hw.web;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	public boolean isPrime(int num) {

		if (num != 2 && (num < 2 || isEven(num))) {
			return false;
		}

		for (int i = 2; i < (int) Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
