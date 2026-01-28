import java.util.Scanner;

class PoundToKilo
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Plase enter the weight in pound");
		float pound= sc.nextFloat();
		double inKg= pound*0.454;
		System.out.println("the conversion for your input in kg is " + inKg);
	}
}
