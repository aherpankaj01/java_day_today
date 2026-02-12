import java.util.Scanner;

class TableDo 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num for table: ");
		int num=1;
		int num2= sc.nextInt();
		
		do
		{
			System.out.println(num2 + " * " + num + " = " + num2*num);
			num++;
		}
		while (num<=10);
	}
}
