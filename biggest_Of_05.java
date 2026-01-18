class biggest_Of_05
{
	public static void main(String[] args) 
	{
		int a= 253, b=56, c=87, d=23, e=154;
		int large;
		int large2;
		int large3;
		int largest = a>(large3=(large=b>c ? b:c)>(large2=d>e ? d:e) ? large:large2) ? a:large3;
		System.out.println(largest);
	}
}
