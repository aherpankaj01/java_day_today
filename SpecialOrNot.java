import java.util.Scanner;

class SpecialOrNot 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your character");
		char ch = sc.next().charAt(0);
		
		String SpecialOrNot = (ch>= 0 && ch <=47 || ch>= 58 && ch <=64 || ch>= 92 && ch <=96 || ch>= 123 && ch <=126 )?(ch + " is a special character"):(ch + " is not a special character");
		
		System.out.println(SpecialOrNot );
	}
}
