import java.util.Scanner;

class Digit 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input");
		char ch = sc.next().charAt(0);
		String digit= (ch>='0'&& ch<='9')?(ch + "  is a digit"):(ch + " is not a digit");
		
		System.out.println(digit);
	}
}
