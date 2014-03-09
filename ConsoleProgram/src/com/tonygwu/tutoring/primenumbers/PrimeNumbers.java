package com.tonygwu.tutoring.primenumbers;

import acm.program.ConsoleProgram;

public class PrimeNumbers extends ConsoleProgram {

	public void listPrimeNumbers() {
		int j = readInt("Please enter your numbere here: ");
		for (int i = 2; i < j; i++) {
			if (isPrime(i)) {
				println(i);
			}
		}
	}
	
	public boolean isPrime(int x) {
		boolean isPrime = true;
		for (int n = 2; n < Math.sqrt(x); n++) {
			if (x % n == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public void coltsMethod() {
		int x = readInt("Please enter your number here: ");
		if (x == 2) {
			println("Prime");
		} else {
			int n = 2;
			while (n < x) {
				if (x % n == 0) {
					println("Not prime");
					n = x + 1;
				} else {
					n = n + 1;
					if (n == x) {
						println("Prime");
					}
				}
			}
		}
	}

	public void run() {
		listPrimeNumbers();
	}
}
