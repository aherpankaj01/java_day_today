import java.util.Scanner;
class ArrayTake 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array  !");
		int size=sc.nextInt();
		int num[]= new int [size];
		
		System.out.println("enter the elements");
		for (int i =0; i<size ; i++ )
		{
			num[i]=sc.nextInt();
			
		}
		
		System.out.print("enter the num to find");
		int target=sc.nextInt();
		
		for (int i=0;i<size ;i++ )
		{
			if (num[i]==target)
			{
				System.out.println("found");
				break;
			}
		}

	}
}
