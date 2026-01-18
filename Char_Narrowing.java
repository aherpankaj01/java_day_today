class  Char_Narrowing
{
	public static void main(String[] args) 
	{
		char b1= (char)100;  //d
		System.out.println(b1);
		
		char b2= (char)100000; //?
		System.out.println(b2);
		
		char b3= (char) 53690;  //?
		System.out.println(b3);
		
		char b4= (char)100l;   //d
		System.out.println(b4);
		
		char b5= (char)100.0f;  //d
		System.out.println(b5);
		
		char b6= (char)10000.56; //?
		System.out.println(b6);
		
		char b7= (char)'c';    //c
		System.out.println(b7);
	}
}
