class Biggest_Of_04
{
	public static void main(String[] args) 
	{
		
		int a= 100, b=50, c=65, d=900;
		int large;
		int large2;
		int largest = (large=a>b ? a:b)>(large2=c>d ? c:d) ? large:large2;
		System.out.println(largest);
	}
}
