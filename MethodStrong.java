import java.util.Scanner;

class MethodStrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is strong:");
        
        int num = sc.nextInt();
        
        int result = sumOfFactorials(num);
        
        if (check(num, result)) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate sum of factorials of digits
    public static int sumOfFactorials(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int last = temp % 10;
            sum += factorial(last);
            temp /= 10;
        }

        return sum;
    }

    // Method to check strong number
    public static boolean check(int num, int sum) {
        return num == sum;
    }
}