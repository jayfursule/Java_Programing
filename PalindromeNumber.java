import java.util.*;

class PalindromeNumber
{
	public static void main(String args[])
	{
		int orignalNumber;
		int reverseNumber=0;
		int number;
		int remainder;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		orignalNumber = number = scan.nextInt();
		while(number!=0)
		{
			remainder = number%10;
			reverseNumber = (reverseNumber * 10) + remainder;
			number = number/10;
		}
		if(orignalNumber == reverseNumber)
		{
			System.out.println("you entered number is palindrome");
		}
		else
		{
			System.out.println("you entered number is not palindrome");
		}
	}
}