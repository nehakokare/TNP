package Exception;

public class Executor {

	public static void main(String[] args) {
		try
		{
		//throw new InsufficientBalanceException();
			throw new InterruptedException();
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InterruptedException e)
		{
			
		}
	}

}
