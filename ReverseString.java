import java.util.Scanner;

class Swap
{
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter string");
		
		String s = scan.nextLine();
		int i=s.length();
		for (i=i-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
}
