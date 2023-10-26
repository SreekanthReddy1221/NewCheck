package javaPrograms;

import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int ori_num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		int num = ori_num;

		while (num>0) {
			int rem = num % 10;
			if (rem%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			num = num/10;
		}
		System.out.println("Total count of Even digits are:- " + evenCount);
		
		System.out.println("Total count of Odd digits are:- " + oddCount);
		sc.close();

	}

}
