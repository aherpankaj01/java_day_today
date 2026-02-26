import java.util.Scanner;

class LCMOfThree 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the num 1 : ");
		int num1= sc.nextInt();
		System.out.println("enter the num 2 : ");
		int num2= sc.nextInt();
		System.out.println("enter the num 3 : ");
		int num3= sc.nextInt();
		int i=1;
		
		int large= num1>num2 ? (num1>num3 ? num1:num3) : (num2>num3 ? num2:num3);
		
		while (true)
		{
			if ((large*i)%num1==0 && (large*i)%num2==0 && (large*i)%num3==0)
			{
				System.out.println("the lc of three num : " + num1 +" " + num2 + " " + num3 + "is " + large*i);
				break;
			} 
				i++;
		}
	}
}
