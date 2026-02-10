import java.util.Scanner;

class CalculateTax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n Please enter your salary to find the tax need to pay");
		double sal= sc.nextDouble();
		if (sal>2400000.0)
		{
			System.out.println( "tax slab for your sal is 30%");
			double tax = sal *30/100;
			System.out.println( "tax ned to pay for sal " + sal + " is " + tax);
		} else if (sal>2000000.0)
		{
			System.out.println( "tax slab for your sal is 25%");
			double tax = sal *25/100;
			System.out.println( "tax ned to pay for sal " + sal + " is " + tax);
		} else if (sal>1600000.0)
		{
			System.out.println( "tax slab for your sal is 20%");
			double tax = sal *20/100;
			System.out.println( "tax ned to pay for sal " + sal + " is " + tax);
		} else if (sal>1200000.0)
		{
			System.out.println( "tax slab for your sal is 15%");
			double tax = sal *15/100;
			System.out.println( "tax ned to pay for sal " + sal + " is " + tax);
		} else if (sal>800000.0)
		{
			System.out.println( "tax slab for your sal is 10%");
			double tax = sal *10/100;
			System.out.println( "tax ned to pay for sal " + sal + " is " + tax);
		} else if (sal>400000.0)
		{
			System.out.println( "tax slab for your sal is 5%");
			double tax = sal *5/100;
			System.out.println( "tax ned to pay for sal " + sal + " is " + tax);
		} else {
			System.out.println("you sal is not eligible for tax");
		}
	}
}
