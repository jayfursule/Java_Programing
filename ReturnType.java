/* lets create a method that
 takes two parameters of 
 type int and returns the 
 greater one then call it in main */
import java.util.Scanner;

 class ReturnType
 {	
	static int Max(int a, int b,int c)
	{
		if(a>b&a>c)
		{	
			System.out.println("\ngreter number is ");
			return a;
		}
		else if (a==b&a==c)
		{
			System.out.println("\nYou entered the same number");
			return a;
		}
		else if(b>c)
		{
			System.out.println("\ngreter number is ");
			
			return b;
		}
		else
			System.out.println("Greater no. is");
			return c;
	}
	
	// program to return greatest between two numbers
	// driver class is started from following
	
	
	public static void main(String args[])
	{	
		Scanner scan = new Scanner(System.in);
		
		int res=Max(1,5,7);
		System.out.println(res);
		// second input 
		res=Max(89,65,22);
		System.out.println(res);
		//just testing third input dirctly in print statement
		System.out.println(Max(2,9,8));
		//-----------------------------------------------------
		ReturnType rt = new ReturnType();
		System.out.println("enter first number");
	
		int firstNum = scan.nextInt();
		System.out.println("enter second number");
		int secondNum = scan.nextInt();
		System.out.println("enter third number");
		int thirdNum = scan.nextInt();
		int r=rt.Max(firstNum,secondNum,thirdNum);
		System.out.print(+r);
		
		
	}
 }