import java.util.Scanner;

class TwinPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        boolean isPrime1 = true;
        boolean isPrime2 = true;
		
        if (num1 <= 1) {
            isPrime1 = false;
        } else {
            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i == 0) {
                    isPrime1 = false;
                    break;
                }
            }
        }

        if (num2 <= 1) {
            isPrime2 = false;
        } else {
            for (int i = 2; i <= num2 / 2; i++) {
                if (num2 % i == 0) {
                    isPrime2 = false;
                    break;
                }
            }
        }

        if (isPrime1 && isPrime2 && Math.abs(num1 - num2) == 2) {
            System.out.println("Twin Prime Numbers");
        } else {
            System.out.println("Not Twin Prime Numbers");
        }
    }
}