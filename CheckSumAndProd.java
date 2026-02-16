import java.util.Scanner;

class CheckSumAndProd
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num= sc.nextInt();
		int product=1;
		int sum=0;
		int last;
		
		while (num>0)
		{
			last= num%10;
			sum+=last;
			product*=last;
			num/=10;
			
		}
		
		System.out.println("product of num: " + product);
		System.out.println("sum of num: " + sum);
		
		if (product==sum)
		{
			System.out.println("product is equal to sum");
		}
		else{
			System.out.println("product is not equal to sum ");
		}
		
	}
}
