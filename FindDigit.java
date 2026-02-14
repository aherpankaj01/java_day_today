import java.util.Scanner;

class FindDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number to count digit");
		
		int num= sc.nextInt();
		System.out.println("enter the digit you need to find :");
		int find= sc.nextInt();
		int last;
		
		while (num>0)
		{
			last= num%10;
			num/=10;
			
			if (last==find)
			{
				System.out.println("this digit is present in num" + last);
			
			}
			
		}
	}
}

2[1
