import java.util.Scanner;

class AnyThing
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        char ch = sc.next().charAt(0);

        String all =
            ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            ? ((ch >= 'A' && ch <= 'Z')
                ? (ch + " is an Uppercase letter")
                : (ch + " is a Lowercase letter"))
            : ((ch >= '0' && ch <= '9')
                ? (ch + " is a Digit")
                : (ch + " is a Symbol"));

        System.out.println(all);
    }
}
