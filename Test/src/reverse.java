import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= sc.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			System.out.println("Reverce no"+r);                                                                                                
			n=n/10;
		}
	}
}
