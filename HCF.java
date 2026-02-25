import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1 :");
		int n1=sc.nextInt();
		System.out.println("enter num2 :");
		int n2=sc.nextInt();
		int i=1;
		int small= n1<n2?n1:n2;
		
		while (true)
		{
			if (n1%small==0 && n2%small==0)
			{
				System.out.println("LCM Of the two given num : " + n1 + " num2" + n2 + " is " + small);
				break;
			}
			small--;
		}
	}
}
