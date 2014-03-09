package com.tonygwu.tutoring.primenumbers;

import acm.program.ConsoleProgram;

public class ListPrimeNumbers extends ConsoleProgram {
	
	public void listPrimeNumbers(int n) {
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				println(i);
			}
		}
	}
	
	public void run() {
		int number = readInt("Enter a number, and I'll list all the primes up to that number: ");
		listPrimeNumbers(number);
	}
}
