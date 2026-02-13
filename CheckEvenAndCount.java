import java.util.Scanner;

class CheckEvenAndCount 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr num");
		int num= sc.nextInt();
		
		int countEven=0;
		int even;
		
		while (num>0)
		{
			even= num%10;
			if (even%2==0)
			{
				System.out.println(even);
				countEven++;
			}
			num/=10;
			
			
		}
		
		System.out.println("total  num of even in num is:" +countEven);
	}
}
