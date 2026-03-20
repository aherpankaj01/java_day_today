import java.util.Scanner;

class MethodAutomorphic 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num :");
		int num=sc.nextInt();
		if (automorphic(num))
		{
			System.out.println("the given num is automorphic :");
		} else {
			System.out.println("the given num is automorphic :");
		}
	}
	
	public static boolean automorphic(int num){
		int temp=num;
		int ct=0;
		int sqr= num*num;
		while (temp!=0)
		{
			ct++;
			temp/=10;
		}
		
		
		int pow=1;
		for (int i=0;i<ct ;i++ )
		{
			pow*=10;
		}
		
		int rem= sqr%pow;
		if (rem==num)
		{
			return true;
		} else {
            return false;
	}

}
}