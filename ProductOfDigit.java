import java.util.Scanner;

class ProductOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num= sc.nextInt();
		int product=1;
		int last;
		
		while (num>0)
		{
			last= num%10;
			product*=last;
			num/=10;
			
		}
		
		System.out.println("product of num: " + product);
		
	}
}
