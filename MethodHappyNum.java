import java.util.Scanner;

class MethodHappyNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }

    public static boolean isHappy(int num) {
        while (num != 1 && num != 4) {
            int sum = 0;

            while (num != 0) {
                int last = num % 10;
                sum += last * last;
                num /= 10;
            }

            num = sum; 
        }

        return num == 1;
    }
}