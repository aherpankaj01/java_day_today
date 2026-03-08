/*
1  2  3  4
1  2  3  4
1  2  3  4
1  2  3  4
*/


import java.util.Scanner;
class pattern3
{
	public static void main (String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num : ");
		int n= sc.nextInt();
		
		int num=1;
		
		for (int i=0; i<n ;i++ )
		{
			for (int j=0; j<n ; j++ )
			{
				System.out.print(" " + num++);
			}
			num=1;
			System.out.println();
		}
		
	}
}