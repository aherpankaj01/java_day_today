/*
1  2  3  4
5  6  7  8
9 10 11 12
13 14 15 16  */

import java.util.Scanner;

class pattern1
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
			System.out.println();
		}
		
	}
}