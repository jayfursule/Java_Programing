// program to swap to numbers without using third variable
import java.util.Scanner;

class SwapTwoNumbers
{
	public static void main(String args[])
	{
		int First,Second;
		// display msg to get input from screen
		System.out.println("enter the first and second number");
		
		//create object of Scanner class
		
		Scanner in = new Scanner(System.in);
		
		// take input by using nextInt method
		First = in.nextInt();
		Second = in.nextInt();
		
		//before swaping
		System.out.println("before swaping first number is "+ First +" second number is "+ Second);
		
		// After swaping           a=10,b=20   a=a+b
		First = First+Second;// a=30
		Second = First-Second;// b=30-20      b=10
		First = First-Second;		// a=a-b       a=30-10=20
		
		//display the swaped numbers
		System.out.println("After Swaping first number is "+ First +" second number is "+ Second);
	}
}