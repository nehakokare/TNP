package Test;

public class sum {

	public static void main(String[] args) {
		int a[]= {10,17,25,50,71,32};
		int len=a.length;
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is:"+sum);
		

	}

}
