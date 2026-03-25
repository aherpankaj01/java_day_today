import java.util.Scanner;
class XylemAndPhloem 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num: ");
		int num=sc.nextInt();
		if (checkNum(num))
		{
			System.out.println("the num is xylem: ");
		}  else {
			System.out.println("the num is phloem: ");
		}
		
	}
	
	public static boolean checkNum(int num) {
		int temp=num;
		int sumOfMidddle=0;
		
		int firstDigit=num;
		while (firstDigit>=9)
		{
			firstDigit/=10;
		}
		
		temp/=10;
		while (temp>=9)
		{
			int last=temp%10;
			sumOfMidddle+=last;
			temp/=10;
		}
		
		int sumOfExtreme= firstDigit +(num%10);
		
		return sumOfMidddle==sumOfExtreme;
		
	}
	
	
}
