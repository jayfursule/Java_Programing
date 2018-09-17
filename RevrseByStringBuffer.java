//program of revrse a string using string buffer inbuild functions
import java.util.*;
class A15
{	

	
	public static void main(String args[])
	{
	StringBuffer s1 = new StringBuffer();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	s1.append(scan.nextLine());
	System.out.println("Revrse String is: "+s1.reverse());
	
	}
}