package javaPrograms;

public class Swap_two_numbers {

	public static void main(String args[]) {
		int a=10, b=40;
		System.out.println("Before swapping the value:- "+a +" , "+b);
		
/*	//By using 3rd Variable -- Logic1
		int m;
		m=a;
		a=b;
		b=m;
		System.out.println("After Swapping the values using Logic1:- "+a+" , "+b);
*/
		
/*	//Logic2 --- using "+" & "-"	(without using 3rd variable)
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the values using Logic2:- "+a+" , "+b);
*/	
		
	//Logic3 --- using "*" "/"   {here both a , b shouldn't be zero. )
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping the values using Logic3:- "+a+" , "+b);
	
		
	}
}
