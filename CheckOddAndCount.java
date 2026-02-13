import java.util.Scanner;

class CheckOddAndCount 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr num");
		int num= sc.nextInt();
		
		int countOdd=0;
		int odd;
		
		while (num>0)
		{
			odd= num%10;
			if (odd%2 !=0)
			{
				System.out.println(odd);
				countOdd++;
			}
			num/=10;
			
			
		}
		
		System.out.println("total  num of even in num is:" +countOdd);
	}
}
