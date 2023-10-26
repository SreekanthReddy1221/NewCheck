package javaPrograms;
import java.util.*;

public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num_ori = sc.nextInt();
		int num = num_ori;
		int rev=0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(num_ori==rev)
		{
			System.out.println(num_ori+" is a Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
	}

}
