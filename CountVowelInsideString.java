import java.util.Scanner;

class CountVowelInsideString 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please enetr the string to calculate vowels");
		
		String find= sc.nextLine();
		
		int result = countVowel( find);
		
		System.out.println("the count of vowels in srting is " +result);
		
		
		
		
	}
	
	public static int countVowel(String find) {
		int count=0;
		for (int i =0; i< find.length()  ; i++ )
		{
			char ch= find.charAt(i);
			
			if (ch=='a' || ch=='A'|| ch=='E'|| ch=='e'|| ch=='I'|| ch=='I'|| ch=='O'|| ch=='o'|| ch=='U' || ch=='u')
			{
				count++;
			}
			
			
			
		}
		return count;
		
	}
}
