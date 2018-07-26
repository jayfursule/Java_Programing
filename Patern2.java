/*
write a program to display the following output

* * * * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;

class Patern2
{
	public static void Patern2(int n)
	{
		// Outer loop to handle number of rows
			
		for(int i=1;i<=n;i++)
		{	
			
			
			// inner loop to handle number of columns
			for(int k=1; k<=n-i+1; k++)
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
	
	//create object of patern class
	
	Patern2 pt = new Patern2();
	pt.Patern2(number);
	
	
	}
	
}