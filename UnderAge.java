class UnderAge extends Exception
{
	private int age;
	UnderAge(int a)
	{
		age=a;
	}
	public String toString()
	{
		return "Under age , "+age;
	}
}

class exceptionDemo
{
	static void test(int a) throws UnderAge
	{
		System.out.println("Called test("+a+")");
		if(a<18)
		throw new UnderAge(a);
		System.out.println("Above 18");
	}
	public static void main(String args[])
	{
		try
		{
			test(50);
			test(2);
                                                 test(3);
		}
		catch(UnderAge e)
		{
			System.out.println(e);
		}
	}
}