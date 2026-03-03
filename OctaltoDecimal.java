import java.util.Scanner;

class OctaltoDecimal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value: ");
        int num = sc.nextInt();

        int decimal = 0;
        int base = 1;  

        while (num != 0)
        {
            int lastDigit = num % 10;
            decimal = decimal + lastDigit * base;
            base = base * 8;   // multiply base by 2 each time
            num = num / 10;    // remove last digit
        }

        System.out.println("Decimal value is: " + decimal);
    }
}