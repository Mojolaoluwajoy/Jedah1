package classWorks;

public class MultiplicationTable {
    public static void main (String[] args) {

        int number = 1;
        int multiplier;


        System.out.println("MULTIPLICATION TABLE");
        System.out.println("==================================START====================================");
        for (multiplier = 1; multiplier <= 12; multiplier++) {
            for (number = 1; number <= 5; number++) {

                System.out.printf("|%d * %2d = %2d ", number, multiplier, (number * multiplier));
            }

            System.out.println();
        }
        System.out.println("==================================END======================================");

    }
}