import java.util.Scanner;

class UpperOrLower 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        char ch = sc.next().charAt(0);

        String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                ? ((ch >= 'A' && ch <= 'Z') 
                    ? (ch + " is an Upper case letter") 
                    : (ch + " is a Lower case letter"))
                : (ch + " is not an alphabet");

        System.out.println(result);
    }
}
