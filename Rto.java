import java.util.*;


class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return "you are too young, Hold on!!!";
	}
}

class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "you are too old, cool down!!!";
	}
}

class Applicant
{
	int age;
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age= scan.nextInt();
		
	}
	public void verify() throws Exception
	{
		if(age < 18)
		{
			UnderAgeException uae = new UnderAgeException();
			System.out.print(uae.getMessage());
			throw uae;
		}
		else if ( age > 70)
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Collect your Driving Licene");
		}
	}
	
}

class Test1
{
	public void initiate()
	{
		Applicant a= new Applicant();
		try
		{
			a.acceptInput();
			a.verify();
		}
		catch (Exception e)
		{
			try 
			{
				a.acceptInput();
				a.verify();
			}
			catch(Exception f)
			{
			
			try
			{
				a.acceptInput();
				a.verify();
			}
			catch(Exception g)
			{
				System.out.println("you are blocked for one year");
				
			}
			}
		}
	}
}


class Rto
{
	public static void main(String args[])
	{
		Test1 t1= new Test1();
		t1.initiate();
	}
}