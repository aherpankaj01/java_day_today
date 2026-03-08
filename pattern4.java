/*
a  b  c  d
e  f  g  h
i  j  k  l
m  n  o  p
*/



import java.util.Scanner;
class pattern4
{
	public static void main (String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num : ");
		int n= sc.nextInt();
		
		char ch= 'a';
		
		for (int i=0; i<n ;i++ )
		{
			for (int j=0; j<n ; j++ )
			{
				System.out.print(" " + ch++);
			}
			System.out.println();
		}
		
	}
}