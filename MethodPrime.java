import java.util.Scanner;

class MethodPrime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (isPrime(num))   
        {
            System.out.println("The number is prime");
        } 
        else 
        {
            System.out.println("The number is not prime");
        }
    }

    public static boolean isPrime(int num) 
    {
        if (num <= 1)  
        {
            return false;
        }

        int den = 2;

        while (den <= num / 2)
        {
            if (num % den == 0)
            {
                return false;   
            }
            den++;
        }

        return true;   
    }
}