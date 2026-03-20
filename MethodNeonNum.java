import java.util.Scanner;

class MethodNeonNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num to check it is a neon num or not");
		int  num= sc.nextInt();
		if (isNeonNum(num))
		{
			System.out.println("the num is neon");
		}else{
			System.out.println("the num is  not neon");
		}
		
	}
	
	public static boolean isNeonNum(int num){
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
			return true;
		}else {
			
			return false;
		}
		}
}