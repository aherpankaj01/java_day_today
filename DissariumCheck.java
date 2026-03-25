import java.util.Scanner;

class DissariumCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = checkDissarium(num);

        if (result == num) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
    }

    public static int checkDissarium(int num) {
        int temp = num;
        int ct = 0;

        // Count digits
        while (temp != 0) {
            ct++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        // Calculate sum
        while (temp != 0) {
            int last = temp % 10;
            int pow = 1;

            for (int i = 0; i < ct; i++) {
                pow = pow * last;
            }

            sum += pow;
            ct--;
            temp /= 10;
        }

        return sum;
    }
}