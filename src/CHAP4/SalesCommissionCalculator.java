package CHAP4;
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double item = 0;
        double totalItems = 0;
        double itemCounter =0;
        int weeklyEarnings=200;
        double totalWeeklyEarnings =0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first item:");
        item = scanner.nextDouble();

        while (item != -3) {


            System.out.print("Enter the next item:");
            item = scanner.nextDouble();

            totalItems += item;
            itemCounter ++;
        }
        totalWeeklyEarnings = weeklyEarnings + (item / 0.9);
        System.out.println("Total weekly earning of the salesperson is :" + totalWeeklyEarnings);



    }

}
