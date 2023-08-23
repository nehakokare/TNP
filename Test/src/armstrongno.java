import java.util.Scanner;

public class armstrongno {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
			System.out.println("enter the number:");
			int no= sc.nextInt();
			int rem,sum=0,temp;
			temp=no;
			while(no>0)
			{
				rem=no%10;
				sum=sum+(rem*rem*rem);
				no=no/10;
			}
			if (temp==sum)
			{
				System.out.println("Given number is armstrong");
			}
			else
			{
				System.out.println("Given number is not armstrong ");
			}
	}
}
