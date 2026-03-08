/* a1 b2 c3
   d4 e5 f6
   g7 h8 i9
   j10 k11 l12
   
*/


import java.util.Scanner;
class pattern6
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
					System.out.print(" " + ch++ + num++);
			}
			System.out.println();
		}
		
	}
}