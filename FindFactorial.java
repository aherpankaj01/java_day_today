import java.util.Scanner;
class FindFactorial
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the num for factorial!");
		int num= sc.nextInt();
		int result= findFactorial( num);
		System.out.println("the result of factorial is " +result);
		
	}
	
	public static int findFactorial(int num){
		int sum=1;
		for (int i= num; i>0 ; i-- )
		{
			sum *=i;
		}
		
		return sum;
		
	}
}
