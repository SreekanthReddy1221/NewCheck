package javaPrograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();  //3
		int total = 0;
		for (int i=num-1;i>0;i--)	//
		{
			total = num * (num-1);	// 3*2 
		}
		System.out.println("The factorial value is " +total);
		sc.close();

	}

}
