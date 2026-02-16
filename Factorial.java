import java.util.Scanner;

class Factorial
{
	public static void main(String[] args) 
	{
	    Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a Number find fact :");
		
		int num = sc.nextInt();
		
		int fact =1;
		
		
		while(num!=0)
		{
			fact=num*fact;
			num--;
		}
		System.out.println("factorial :"+ fact);
	}
}