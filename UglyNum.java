import java.util.Scanner;
class UglyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num: ");
		int num=sc.nextInt();
		
		if (checkUgly(num))
		{
			System.out.println("ugly");
		} else {
			System.out.println("not ugly");
		}
		
	}
	
	
	public static boolean checkUgly(int num) {
		int temp=num;
		while (temp!=0)
		{
			if (temp%2==0)
			{
				temp/=2;
			} else if (temp%3==0)
			{
				temp/=3;
			} else if (temp%5==0)
			{
				temp/=5;
			} else {
				break;
			}
			
			
		}
		
		if (temp==1)
		{
			return true;
		} else {
			return false;
		}}
}
