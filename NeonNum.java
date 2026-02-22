import java.util.Scanner;

class NeonNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num to check it is a neon num or not");
		int  num= sc.nextInt();
		if (num<0)
		{
			num*=-1;
		}
		
		int squr= num*num;
		int sum=0;
		
		while (squr>0)
		{
			int last= squr%10;
			sum+=last;
			squr/=10;
			
		}
		
		
		if (sum==num)
		{
			System.out.println("the enter num is neon num:");
		}else {
			
			System.out.println("enter num is not neon num :");
		}
	}
}
