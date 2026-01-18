class  Double_Narrowing
{
	public static void main(String[] args) 
	{
		double b1= (double)100;  //100.0
		System.out.println(b1);
		
		double b2= (double)100000; //100000.0
		System.out.println(b2);
		
		double b3= (double) 53690;  //53690.0
		System.out.println(b3);
		
		double b4= (double)100l;   //100.0
		System.out.println(b4);
		
		double b5= (double)100.0f;  //100.0
		System.out.println(b5);
		
		double b6= (double)10000.56; //10000.56
		System.out.println(b6);
		
		double b7= (double)'c';    //99.0
		System.out.println(b7);
	}
}