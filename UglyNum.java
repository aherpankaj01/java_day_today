import java.util.Scanner;
class UglyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num:");
		int num=sc.nextInt();
		
		while (num !=0) 
		{
			if (num%2==0)
			{
				num/=2;
			} else if (num%3==0)
			{
				num/=3;
			} else if (num%5==0)
			{
				num/=5;
			}
			else {
				break;
			}
		}
		
		if (num==1)
		{ System.out.println("the given num is ugly num :");
		} else {
           System.out.println("the given num is not ugly num :");
		}
		
	}
}
