/*
1
2 3
4 5 6
7 8 9 10
*/


import java.util.Scanner;

class pattern7
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
				System.out.print(" " + num++);
			}
			System.out.println();
		}
		
	}
}