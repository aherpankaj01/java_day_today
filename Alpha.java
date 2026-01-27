import java.util.Scanner;

class Alpha 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input");
		char ch = sc.next().charAt(0);
		String digit= (ch>='A'&& ch<='Z' ||ch>='a'&& ch<='z' )?(ch + "  is a character"):(ch + " is not a character");
		
		System.out.println(digit);
	}
}
