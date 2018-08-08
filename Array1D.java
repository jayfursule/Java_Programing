import java.util.Scanner;

class Array1D
{
	public static void main(String args[])
	{
		int i;
		Scanner scan= new Scanner(System.in);
		int a[] = new int [5];
		for(i=0;i<=4;i++)
		{
			System.out.println("Entere the marks of student "+i);
			a[i] = scan.nextInt();
		}
		System.out.println("Student marks are...");
		for (i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}