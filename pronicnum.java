import java.util.Scanner;

class pronicnum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the nu  to check it is proonic or not: ");
		int num=sc.nextInt();
		
		int n1=1; int n2=2;
		int mul=1;
		
		while (mul<=num)
		{
			mul=n1*n2;
			if (mul==num)
			{
				System.out.println("the given num is pronic num and the consecutive nums are : " + n1 + " " + n2 );
			}
			n1=n2;
			n2++;
				
		}
		
	}
}
