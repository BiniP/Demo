package com.sansa.class2;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		boolean prime = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");

		int num = sc.nextInt();
//		prime number is divisible by 1 and number itself,exclude 1 and number in loop

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime) {
			System.out.println("The Number is  prime");

		} else {
			System.out.println("The Number is not prime");
		}
	}

}
