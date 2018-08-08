// this following program takes total 9 inputs by using 3-D Jagged array 
// this program is to display the marks of student from different classes and different schools
import java.util.*;  // this line imports the scanner class

class Array3D
{	
	public static void main(String args[])
	{
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		int a[][][]= new int[2][][];
		//school 
		a[0] = new int[2][];
		a[1] = new int[3][];
		// class
		a[0][0] = new int[3];
		a[0][1] = new int[2];
		//students
		a[1][0] = new int[1];
		a[1][1] = new int[2];
		a[1][2] = new int[1];
		
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				for (k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of school "+i+" class "+j+" student "+k);
					a[i][j][k]= scan.nextInt();
					
				}
			}
		}
		System.out.println("Student marks are...");
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				for(k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println(a[i][j][k]);
				}
			}
		}
		
	}
}