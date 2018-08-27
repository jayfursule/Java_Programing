class A2
{
	 A2()
	{	
		System.out.println("constructor A1 is executed");
	}
	
	
	{
		System.out.println("Non static block is executed");
	}

   
	
	static 
	{
		System.out.println("static block is executed");
	}


}


class StaticDemo
{
	public static void main(String args[])
	{
		System.out.println("main method is executed");
		A2 d1= new A2();
		
	}
}
