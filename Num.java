import java.util.Scanner;

class Num
{
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the starting num: ");
		int num1= sc.nextInt();
		System.out.println("please enter the ending num: ");
		int num2= sc.nextInt();
		
		do
		{
			System.out.println(num1);
			num1++;
		}
		while (num1<=num2);
	} 
}