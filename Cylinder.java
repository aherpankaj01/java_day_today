import java.util.Scanner;
class Cylinder
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println(" Please enter the radius");
		double radius = sc.nextDouble();
		System.out.println(" Please enter the height");
		double height = sc.nextDouble();
		final double PIE= 22/7.0;
		final double area= PIE*(radius*radius);
		final double volume= area*height;
		System.out.printf("area of cylinder : %3f cm^2 \n ", area);
		System.out.printf("volume of cylinder : %3f cm \n ", volume);
	}
}
