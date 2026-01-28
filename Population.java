import java.util.Scanner;

class Population {
    public static void main(String[] args) {

        System.out.println("Please enter the population");
        Scanner sc = new Scanner(System.in);

        final long population = sc.nextLong();
        System.out.println("The population of the country is: " + population);

        final int birth = 7;
        final int death = 13;
        final int immigration = 45;

        final long totalSec = (365L * 24 * 60 * 60) * 5;

        long totalBirth = totalSec / birth;
        long totalDeath = totalSec / death;
        long totalImmigration = totalSec / immigration;

        long totalPopulation =
                population + totalBirth - totalDeath + totalImmigration;

        System.out.println("The total population after 5 years is: " + totalPopulation);
    }
}
