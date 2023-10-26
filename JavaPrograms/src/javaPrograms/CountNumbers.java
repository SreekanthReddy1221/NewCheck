package javaPrograms;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a Number:- ");
		int numbr = sc.nextInt();
		int count = 0;

		while (numbr != 0) {
			numbr = numbr/10;
			count++;
		}
		System.out.println("Total Number of digits are:- " + count);
		sc.close();

	}

}
