import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter the num");
		double num = sc.nextDouble();
		System.out.println("enter the power");
		double power = sc.nextDouble();
		
		if (power<0)
		{
			power*=-1;
			num=1/num;
			
		}
		double op=1;
		for (int i=1; i<= power ;i++ )
		{
			op= op*num;
		}
		
		System.out.println("user defined " + op);
		System.out.println("java output " + Math.pow(num,power));
	}
}
