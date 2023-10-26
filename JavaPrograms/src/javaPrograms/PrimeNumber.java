package javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int num = sc.nextInt();

		while (num > 0) {
			if ((num / 2) != 0) {
				System.out.println("This is a prime number");
				break;
			} else {
				System.out.println("This is not a prime Number");
				break;
			}
		}

		sc.close();

	}

}
