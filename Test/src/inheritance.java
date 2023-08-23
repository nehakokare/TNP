
public class inheritanc {
	public void show()
	{
		System.out.println("One");
	}

};
class single1 extends single
{
	public void dis()
	{
		System.out.println("Two");
		
	}
}
public class main()
{
	public static void main(String[]args)
	{
		single obj=new single();
		obj.show();
		obj.dis();
		
	}
}

