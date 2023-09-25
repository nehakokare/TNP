package Test;

public class Array {

	public static void main(String[] args) {
		int a[]= {10,17,25,50,71,32};
		 
				int i;
				int len=a.length;
				for(i=0;i<=a.length;i++)
				{
					if(a[i]%2==0)
					{
						System.out.print("given no is"+a[i]);
						
					}
					else
					{
						System.out.println("odd no is"+a[i]);
					}
				}
		

	}

}
