package com.bridgelabz.Algorithm_Programs.PrimeNoAnagramPalindrome;

import java.util.Scanner;

public class PrimeNoAnagramPalindrome {

	public static void main(String[] args) {

		int primeNumber = 2;

		PrimeNoAnagramPalindrome prime = new PrimeNoAnagramPalindrome();
		
		System.out.println("enter a number in between range of 0-1000 : ");
		Scanner scanner = new Scanner(System.in);
		int rangeNum = scanner.nextInt();
		System.out.println("range of number is prime angram and palandrome number are : ");
		while (primeNumber <= rangeNum) {
			int temp = 0;
			
			for (int i = 2; i <= primeNumber / 2; i++) {

				if (primeNumber % i == 0) {
					temp++;
					break;
				}
			}
			if (temp == 0) {
				
				if(prime.anagram(primeNumber)) {
					prime.palandrome(primeNumber);
				}
			}
			primeNumber++;
		}
	}

	private void palandrome(int primeNumber) {

		int temp = primeNumber, sum = 0;
		while(temp != 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		if(sum == primeNumber) {
			System.out.print(primeNumber + " ");
		}
	}

	private boolean anagram(int primeNumber) {
		
//		int temp = primeNumber;
//		while(temp!=0) {
//			
//			int rem = temp % 10;
//			
//		}
		return true;
	}
}