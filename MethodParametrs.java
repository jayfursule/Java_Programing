class MethodParametrs
{
	public static void main(String args[])
	{
		M1 mp=new M1();
		mp.sayHello("you are passing the string parameter");
		mp.sayHello("\n !@you can reuse the same method for different parametrs");
		mp.returnFive();
	}
}



class M1
{
	static void sayHello(String s)
	{
		System.out.println(s);
	}
	
	//return value integer
	public static int returnFive()
	{
		System.out.println("\n this is from Return Five method");
		return 5;
	}
}





