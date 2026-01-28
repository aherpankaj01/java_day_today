import java.util.Scanner;
class PrimeOrNot 
{
  public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Eneter a Number:");
int num =sc.nextInt();
String result = (num >1 && (num==2 || num%2!=0))? ( num +"Number is Prime"): (num +"Not prime Number");
System.out.println(result);
}
}