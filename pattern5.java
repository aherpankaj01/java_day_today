/*
a  b  c  d
1  2  3  4
e  f  g  h
5  6  7  8
*/


import java.util.Scanner;
class pattern5
{
	public static void main (String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num : ");
		int n= sc.nextInt();
		
		char ch= 'a';
		int num=1;
		
		for (int i=0; i<n ;i++ )
		{
			for (int j=0; j<n ; j++ )
			{
				if (i%2==0)
				{
					System.out.print(" " + ch++);
				} else {
					System.out.print(" " + num++);
				}
			}
			System.out.println();
		}
		
	}
}