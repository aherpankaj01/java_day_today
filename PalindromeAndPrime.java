import java.util.Scanner;

class PalindromeAndPrime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int num = sc.nextInt();
        int original = num;
        int rev = 0;

        // Reverse the number
        while (num != 0) 
        {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }

        // Palindrome check
        if (original == rev) 
            System.out.println("It is a Palindrome.");
        else 
            System.out.println("It is not a Palindrome.");

        // Prime check for original number
        if (isPrime(original))
            System.out.println(original + " is Prime.");
        else
            System.out.println(original + " is not Prime.");

        // Prime check for reversed number
        if (isPrime(rev))
            System.out.println(rev + " (reversed number) is Prime.");
        else
            System.out.println(rev + " (reversed number) is not Prime.");
    }

    // Prime checking method (optimized using vn)
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
