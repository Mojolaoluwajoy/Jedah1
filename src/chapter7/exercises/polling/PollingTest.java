package chapter7.exercises.polling;

import java.util.Scanner;

public class PollingTest {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        String next;
        do {
           Polling.getXRates(scanner);
           scanner.nextLine();
           System.out.println("Enter yes to take the pole for the next person and any other word(s) to quit");
      next=scanner.nextLine();
       }while (next.equalsIgnoreCase("yes"));
       Polling.displayTable();
       }
    }

