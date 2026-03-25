import java.util.Scanner;
class MethodTwistedPrime
 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		
		if(primeCheck(num))
		{
		     if (primeCheck(makeRev(num)))
		     {
				 System.out.println("Yes Twisted Prime");
		     }
			  else 
			{
				   System.out.println("Not Twisted Prime");
			}
			 
		}
		else
		{
			System.out.println("Not a Twisted Prime");
		}
		
	}
	
	
	public static int makeRev(int num)  {
	
		int rev=0;
		while (num!=0)
		{
			int last=num%10;
			rev=rev*10+last;
			num/=10;
			
		}
		
		return rev;
	}
	
	public static boolean primeCheck(int num) {
		int den=2;
		while (den<num)
		{
			if (num%den==0)
			{
				break;	
			}
				den++;
			
		}
		
		return den==num;
		
	
	}
	
}

