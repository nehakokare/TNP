import java.util.Scanner;

public class factorial {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int t1=0,t2=1,t3,i;
		for(i=1;i<no;i++)
		{
			t3=t1+t2;
			System.out.println(t3);
			t1=t2;
			t2=t3;
		}
	}
	

}
