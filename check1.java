class Factorial
{
	   int fact(int N)
	   {
	     int result;
	     if(N==1)
	     return 1;
	     result=N*fact(N-1);
	     return result;
 	   }
}
class check1
{
	 public static void main(String[] args)
	{
	 Factorial F=new Factorial();
	System.out.println("Factorial of 5  is "+F.fact(5));
	}
}