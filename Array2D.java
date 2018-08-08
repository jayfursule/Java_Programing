import java.util.Scanner;

class Array2D 
{
	public static void main(String args[])
	{
		int i,j;
		Scanner scan = new Scanner(System.in);
		int a[][] = new int [2][3];
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				System.out.println("Entere the marks of class "+i+" student "+j);
				a[i][j]= scan.nextInt();
			}
		}
			System.out.println("Student marks are :");
			
			for(i=0;i<=a.length-1;i++)
			{
				for(j=0;j<=a[i].length-1;j++)
				{
					System.out.println(a[i][j]);
				}
			}
		
	}
}