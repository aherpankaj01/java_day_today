import java.util.Scanner;

class MethodUniqueNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int num = sc.nextInt();
        
        if (isUnique(num)) {
            System.out.println("This is a unique number");
        } else {
            System.out.println("This is not a unique number");
        }
    }

    public static boolean isUnique(int num) {
        int temp1 = num;

        while (temp1 != 0) {
            int last1 = temp1 % 10;
            int temp2 = temp1 / 10; 

            while (temp2 != 0) {
                int last2 = temp2 % 10;

                if (last1 == last2) {
                    return false; 
                }

                temp2 /= 10;
            }

            temp1 /= 10;
        }

        return true; 
    }
}