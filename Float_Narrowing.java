class  Float_Narrowing
{
	public static void main(String[] args) 
	{
		float b1= (float)100;  //100.0
		System.out.println(b1);
		
		float b2= (float)100000; //100000.0
		System.out.println(b2);
		
		float b3= (float) 53690;  //53690.0
		System.out.println(b3);
		
		float b4= (float)100l;   //100.0
		System.out.println(b4);
		
		float b5= (float)100.0f;  //100.0
		System.out.println(b5);
		
		float b6= (float)10000.56; //10000.56
		System.out.println(b6);
		
		float b7= (float)'c';    //99.0
		System.out.println(b7);
	}
}