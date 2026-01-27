import java.util.Scanner;

class EvenOrOdd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        int num= sc.nextInt();

        String result = (num%2==0) ? ("the number is even "): (" the number is odd");

        System.out.println(result);
    }
}
