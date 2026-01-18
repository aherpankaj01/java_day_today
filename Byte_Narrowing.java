class  Byte_Narrowing
{
	public static void main(String[] args) 
	{
		byte b1= (byte)100;  //-100
		System.out.println(b1);
		
		byte b2= (byte)100000; //-96
		System.out.println(b2);
		
		byte b3= (byte) 53690;  //-70
		System.out.println(b3);
		
		byte b4= (byte)100l;   //100
		System.out.println(b4);
		
		byte b5= (byte)100.0f;  //100
		System.out.println(b5);
		
		byte b6= (byte)10000.56; //16
		System.out.println(b6);
		
		byte b7= (byte)'c';    //99
		System.out.println(b7);
	}
}
