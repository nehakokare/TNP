package Test;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num,i ,count=0;
		System.out.println("Enter the number");
		num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("Given no is prime");
			}
			else
			{
				System.out.println("Given no is not prime");
			}
			
			}
		}
		

	


