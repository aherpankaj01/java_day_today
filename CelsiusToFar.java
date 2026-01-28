import java.util.Scanner;

class CelsiusToFar
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Plase enter the input");
		double celcius= sc.nextDouble();
		double fahernite= (9.0/5)*celcius+32;
		System.out.println("the conversion for your input in fahernite is " + fahernite );
	}
}
