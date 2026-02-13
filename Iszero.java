import java.util.Scanner;
class Iszero 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter num");
		int num= sc.nextInt();
		
		int checkZero;
		int countZero=0;
		
		while (num>0)
		{
			checkZero= num%10;
			if (checkZero == 0)
			{
				countZero++;
					
			} 
		
			num/=10;
		}
		
		if (countZero >0)
		{
				System.out.println( "zero is present in num" );
				System.out.println("total zero present" + countZero);
		} else {
			System.out.println( "zero is not present in num" );
		}
		
		
	}
}
