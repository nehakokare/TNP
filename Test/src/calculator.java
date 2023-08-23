import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		int num1=0,num2=0,option,ex;		
		do
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your choice:");
			System.out.println("1.add 2.sub 3.mul 4.div 5.exit ");
			option= sc.nextInt();
			if(option!=5)
			{
				System.out.println("Enter the first number:");
				num1=sc.nextInt();
				System.out.println("Enter the second number;");
				num2=sc.nextInt();
			}
			else
			
				break;
			switch(option)
			{
			case 1:
				System.out.println("addition of"+num1+" and "+num2+" is "+(num1+num2));
				break;
			case 2:
				System.out.println("subtraction of"+num1+" and "+num2+" is "+(num1-num2));
				break;
			case 3:
				System.out.println("multiplication of"+num1+" and "+num2+" is "+(num1*num2));
			case 4:
				if(num2==0)
				{
					System.out.println("Error!!!");
				}
					else {
						System.out.println("division of"+num1+" and "+num2+" is "+(num1/num2));

					}
					break;
					case 5:
						System.out.println("exit");
						break;
						default:
							System.out.println("invalid choice");
							break;
				}
			System.out.println("Do you want to countinue? 1.yes 2.no");
			ex=sc.nextInt();
			}
			while(ex==1);
		}
	}

