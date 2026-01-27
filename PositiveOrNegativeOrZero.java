import java.util.Scanner;

class PositiveOrNegativeOrZero
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        int num= sc.nextInt();

        String result = ((num >=1 || num <= -1))
                ? ((num >=1) 
                    ? (num + " is a + ve number") 
                    : (num + " is a  - ve number"))
                : (" it is a zero ");

        System.out.println(result);
    }
}
