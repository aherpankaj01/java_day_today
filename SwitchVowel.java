import java.util.Scanner;

class SwitchVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the character to check is vowel or consonent");
		char ch= sc.next().toLowerCase().charAt(0);
		
		switch(ch) {
			case 'a','e','i','o','u' : System.out.println(char+ "the char is vowel"); break;
			default : System.out.println("the char is consonent"); break;
		}
		 
		
	}
}
