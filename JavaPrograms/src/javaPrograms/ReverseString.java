package javaPrograms;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str=sc.next();		//This will take the String value from the User.
//		String str = "NMKL";
		String rev = "";
		
	//Method 1 --- using Concatenation	
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);	
		}
			
		sc.close();
	
	//Method 2 --- using Character Array	
/*		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+a[i];
		}
*/	
		System.out.println("Reverse String is:- "+rev);
		
	// Method 3 String Buffer Class
/*		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		
		
		System.out.println("Reverse String is:- "+sb.reverse());
*/	
	
	
	}

}
