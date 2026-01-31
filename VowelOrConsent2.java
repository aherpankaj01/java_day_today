import java.util.Scanner;
class VowelOrConsent2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		char a= sc.next().charAt(0);
		if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
			System.out.println("char is vowel");
		} else {
			System.out.println("char is consonent");
		}
		}
}
