class smallest_Of_03
{
	public static void main(String[] args) 
	{
		int n1= 53;
		int n2= 42;
		int n3= 500;
		int ans =n1<n2 ? n1:n2;
		int ans2 = ans < n3 ? ans:n3;
		System.out.println(ans2);
	}
}
