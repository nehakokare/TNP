package ExceptionHandling;

class Exception
{
	public static void main(String[]args)
	{
		System.out.println("Main method is started");
		int a=10,b=0,c;
		try
		{
			
			c=a/b;
			System.out.println(c);
			System.out.println("Main method is ended");
		}
		catch(ArithmeticException e)
		
	{
		System.out.println("e");
	}
	
	
 }
}
