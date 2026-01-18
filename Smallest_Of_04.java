class Smallest_Of_04
{
	public static void main(String[] args) 
	{
		
		int a= 24, b=50, c=65, d=900;
		int small;
		int small2;
		int smallest = (small=a>b ? b:a)>(small2=c>d ? d:c) ? small2:small;
		System.out.println(smallest);
	}
}
