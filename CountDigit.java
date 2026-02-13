import java.util.Scanner;

class CountDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number to count digit");
		
		int num= sc.nextInt();
		int count=0;
		int last;
		
		while (num>0)
		{
			last= num%10;
			count++;
			num/=10;
			System.out.println(last);
		}
		
		
		System.out.println("total digit" + count);
	}
}

