import java.util.Scanner;

public class prime {
	public static void main(String[]args)
	{
		
		
		int i,j;
		for(i=1;i<=500;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(" "+j);			}
	}

}
