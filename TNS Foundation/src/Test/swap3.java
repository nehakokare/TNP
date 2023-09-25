package Test;

import java.util.Scanner;

import.java.util.Scanner;
public class swap3 {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter the number");
		Scanner r = new Scanner(System.in);
		a = r.nextInt();
		b = r.nextInt();
		System.out.println("Before Swapping="+a+" "+b);
	
	temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:"+a+" "+b);
		
		}

}
