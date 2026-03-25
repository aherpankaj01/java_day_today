import java.util.Scanner;
class PronicNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		
		
		int n1=1, n2=2, mul=1;
		
		while (mul<num)
		{
			mul=n1*n2;
			n1=n2;
			n2++;
		}
		
		if (mul==num)
		{
			System.out.println("pronic num: ");
		}
		else {
			System.out.println("not pronic num: ");
		}
	}
}
