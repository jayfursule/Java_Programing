// adition of two numbers
import java.util.Scanner;

class AddTwoNum
{
	static float add(float a, float b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		AddTwoNum ad = new AddTwoNum();
		System.out.println("enter first number : ");
		float First = in.nextFloat();
		System.out.println("enter second number : ");
		float Second = in.nextFloat();
		
		
		System.out.println("addition of First and second number is "+ add(First,Second));
	}
}