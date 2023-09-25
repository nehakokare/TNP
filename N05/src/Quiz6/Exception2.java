package Quiz6;

public class Exception2 {

	public static void main(String[] args) {
		try
		{
			throw new NullPointerException("Hello");
			
		}
		catch(ArithmeticException e)
		{
			System.out.print("B");
		}

	}

}
