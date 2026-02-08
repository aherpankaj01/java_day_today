import java.util.Scanner;

class CheckTheNum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean result = isEven(4);
        System.out.println(result);
    }

    public static boolean isEven(int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
