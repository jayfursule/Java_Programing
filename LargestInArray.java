import java.util.*;

class A10
{	
	Scanner scan = new Scanner(System.in);
	int Arr[] = scan.nextInt();
	
	
	
	
	// method to find largest element in an array
	
	static int largest()
	
	{	
		
	
		int max= Arr[0];
		
		for(int i=1;i<Arr.length;i++)
		{
		if(Arr[i]>max)
			{
				max = Arr[i];
				
			}
		}
		return max;
	}
	
  }


class LargestInArray 
{
	public static void main(String args[])
	{	
		A10 obj=new A10();
		System.out.println("Largest element from array is " +obj.largest());
	}

}