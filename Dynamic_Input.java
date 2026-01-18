import java.util.*;

class Dynamic_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();

        System.out.println("Please enter your college name");
        String college = sc.nextLine();

        System.out.println("Where are you from?");
        String place = sc.nextLine();

        System.out.println("Please enter your age");
        int age = sc.nextInt();

        System.out.println("Please enter your cgpa");
        float cgpa = sc.nextFloat();

        // Consume leftover newline
        sc.nextLine();

        System.out.println("Please enter your birth date");
        String birthDate = sc.nextLine();

        // Displaying the inputs
        System.out.println("\n--- Details ---");
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Place: " + place);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Birth Date: " + birthDate);

        sc.close();
    }
}
