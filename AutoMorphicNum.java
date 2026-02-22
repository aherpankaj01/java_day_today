import java.util.Scanner;

class AutoMorphicNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check automorphic: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int digits = 0;

        
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int divisor = (int) Math.pow(10, digits);

        if (square % divisor == num) {
            System.out.println("Number is Automorphic");
        } else {
            System.out.println("Number is NOT Automorphic");
        }
    }
}