import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1 :");
		int n1=sc.nextInt();
		System.out.println("enter num2 :");
		int n2=sc.nextInt();
		int i=1;
		int large= n1>n2?n1:n2;
		
		while (true)
		{
			if ((large*i) %n1==0 && (large*i) %n2==0)
			{
				System.out.println("LCM Of the two given num : " + n1 + " num2" + n2 + " is " +(large*i));
				break;
			}
			i++;
		}
	}
}
