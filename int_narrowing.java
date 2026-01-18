class  int_Narrowing
{
	public static void main(String[] args) 
	{
		int b1= (int)100;  //100
		System.out.println(b1);
		
		int b2= (int)100000; //100000
		System.out.println(b2);
		
		int b3= (int) 53690;  //53690
		System.out.println(b3);
		
		int b4= (int)100l;   //100
		System.out.println(b4);
		
		int b5= (int)100.0f;  //100
		System.out.println(b5);
		
		int b6= (int)10000.56; //10000
		System.out.println(b6);
		
		int b7= (int)'c';    //99
		System.out.println(b7);
	}
}
