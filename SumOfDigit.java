import java.util.Scanner;

class SumOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num= sc.nextInt();
		int sum=0;
		int last;
		
		while (num>0)
		{
			last= num%10;
			sum+=last;
			num/=10;
			
		}
		
		System.out.println("sum of num: " + sum);
		
	}
}
