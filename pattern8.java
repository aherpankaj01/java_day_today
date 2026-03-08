/*
1
2 2
3 3 3
4 4 4 4
*/



import java.util.Scanner;

class pattern8
{
	public static void main (String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num : ");
		int n= sc.nextInt();
		
		int num=1;
		
		for (int i=0; i<n ;i++ )
		{
			for (int j=0; j<=i ; j++ )
			{
				System.out.print(" " + num);
			}
			num++;
			System.out.println();
		}
		
	}
}