// Java program to find factorial
// of given number
import java.util.Scanner;
class Factorial {
 
  int factorial(int n)
  {
 
    // single line to find factorial
    return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
 
  }
 
 
  // Driver Code
  public static void main(String args[])     
  {
	// display the factorial number  
	System.out.println(" enter the factorial number ");
	
	// scan the factorial num
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("entered number is "+ num);
    Factorial obj = new Factorial();
    
    System.out.println("Factorial of " + num + 
                      " is " + obj.factorial(num));
   }
}