import java.util.Scanner;

class FeetToMeter
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Plase enter the input");
		float feet= sc.nextFloat();
		double meter= feet*0.305;
		System.out.println("the conversion for your input in meter is " + meter);
	}
}
