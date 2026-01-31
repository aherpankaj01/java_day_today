import java.util.Scanner;
class EvenOrOdd2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		if(a==0){
			System.out.println("you are entering the 0");
		}else if (a%2==0)
		{
			System.out.println("integer is even");
		} else {
			System.out.println("integer is odd");
		}
		
		
	}
}
