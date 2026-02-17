import java.util.Scanner;

class ReverseStr 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the num");
		int num= sc.nextInt();
		String str= num + "";
		
		
		String rev= "";
		
		for (int i = 0; i< str.length() ; i++ )
		{
			rev= str.charAt(i) + rev;
		}
		
		System.out.println(rev);
	}
}
