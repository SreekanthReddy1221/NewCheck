package javaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str_ori = sc.next();
		String str = str_ori;
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is:- "+rev);
		System.out.println("Reverse String is:- "+str_ori);
		
		if(str_ori.equals(rev)) 		//Compulsorily we need to use, equals method
		{
			System.out.println("The given String is a Palindrome String");
		}
		else {
			System.out.println("The given String is not a Palindrome String");
		}
		
		sc.close();

	}

}
