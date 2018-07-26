/*
write a program to display the following output

* 
* * 
* * * 
* * * * 
* * * * *

*/
import java.util.Scanner;

class Patern1
{
	public static void Patern1(int n)
	{
		// Outer loop to handle number of rows
			
		for(int i=1;i<=n;i++)
		{	
			
			
			// inner loop to handle number of columns
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			
		// ending line after each row
			
		System.out.println();
		
		}
	}
	// main method to get input from user 
	
	public static void main (String args[])
	{
	// First import Scanner from java.util. Create object of Scanner class
	Scanner in = new Scanner(System.in);
	
	System.out.println("enter number :");
	
	int number = in.nextInt();
	Patern1 pt = new Patern1();
	pt.Patern1(number);
	
	
	}
	
}