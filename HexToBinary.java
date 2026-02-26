import java.util.Scanner;
class HexToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the num :");
		int num= sc.nextInt();
		String hex=" ";
		
		while (num>0)
		{
			int rem= num%16;
			if (rem>=0 && rem <=9)
			{
				hex=rem+hex;
			}
			else {
				hex= ((char) (rem+55)) + hex;	
			}
		}
		num/=16;
		System.out.println(hex);
	}
}
