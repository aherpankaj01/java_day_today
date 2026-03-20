import java.util.Scanner;

class MethodFactorial
{
	public static void main(String[] args) 
	{
	    Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a Number find fact :");
		
		int num = sc.nextInt();
		
		System.out.println(factorial(num));
		
		
		
	}
	
	public static int factorial(int num) {
		int fact =1;
		
		
		while(num!=0)
		{
			fact=num*fact;
			num--;
		}
		
		return fact;
	}
}