package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:- ");
	
		int num=sc.nextInt();

		//Using a Algorithm		(Method 1)	
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num= num/10;
		}
		
		
		//Using StringBuffer Class	(Method 2)
/*		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
*/		
	
		//Using StringBuilder Class		(Method 3)
/*		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		
*/		System.out.println("Reverse Number is:- " +rev);

		
	}

}
