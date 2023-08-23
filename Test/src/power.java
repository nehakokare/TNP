import java.util.Scanner;

public class power {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		System.out.println("Enter power");
		int p=sc.nextInt();
		int i,result=1;
		for(i=1;i<=p;i++)
		{
			result=result*no;
			
		}
		System.out.println("power="+result);
		
		}

}
