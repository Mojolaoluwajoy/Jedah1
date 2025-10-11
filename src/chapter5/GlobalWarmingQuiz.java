package chapter5;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
         Scanner mojo = new Scanner(System.in);
         int total=0;
         int counter;

        System.out.println("GLOBAL WARMING FACTS QUIZ");
        System.out.println("_________________________");



         for (counter=0;counter <= 5;counter++) {

                 switch (counter) {

                     case 0:
                         System.out.println("1.What is global warming?");
                         System.out.println("a.A natural climate cycle.");
                         System.out.println("b.A gradual increase in global temperatures.");
                         System.out.println("c.A decrease in global temperature.");
                         System.out.println("d.All of the above.");

                         System.out.println("Enter your preferred option: ");
                         String answer0 = mojo.nextLine();

                         if (answer0.equals("b") || answer0.equals("B")) {
                             total++;
                         }
                         break;
                     case 1:
                         System.out.println("2.What contributes to global warming?");
                         System.out.println("a.Planting trees.");
                         System.out.println("b.Using public transport.");
                         System.out.println("c.Burning fossil fuels.");
                         System.out.println("d.Recycling.");
                         System.out.println("Enter your preferred option: ");
                         String answer1 = mojo.nextLine();

                         if (answer1.equals("c") || answer1.equals("C")) {
                             total++;
                         }
                         break;

                     case 2:
                         System.out.println("3.What is a consequence of global warming?");
                         System.out.println("a.Colder winter.");
                         System.out.println("b.More frequent natural disasters.");
                         System.out.println("c.Less rainfall.");
                         System.out.println("d.No change in climate.");

                         System.out.println("Enter your preferred option: ");
                         String answer2 = mojo.nextLine();

                         if (answer2.equals("b") || answer2.equals("B")) {
                             total++;
                         }
                         break;

                     case 3:
                         System.out.println("4.How can individuals help reduce global warming?");
                         System.out.println("a.Using more energy.");
                         System.out.println("b.Driving more cars.");
                         System.out.println("c.Reducing,reusing,recycling.");
                         System.out.println("d.Cutting down trees.");

                         System.out.println("Enter your preferred option: ");
                         String answer3 = mojo.nextLine();

                         if (answer3.equals("c") || answer3.equals("C")) {
                             total++;
                         }
                         break;

                     case 4:
                         System.out.println("5.Why is it important to address global warming?");
                         System.out.println("a.It is a natural phenomenon.");
                         System.out.println("b.It affects the environment and human health.");
                         System.out.println("c.Its not a bid deal.");
                         System.out.println("d.It's the future generation's problem.");

                         System.out.println("Enter your preferred option: ");
                         String answer4 = mojo.nextLine();

                         if (answer4.equals("b") || answer4.equals("B")) {
                             total++;
                         }
                         break;

                     case 5:
                         System.out.println("6.What is the term for movement of water from the ocean to the atmosphere?");
                         System.out.println("a.Evaporation.");
                         System.out.println("b.Condensation.");
                         System.out.println("c.Precipitation.");
                         System.out.println("d.No idea.");

                         System.out.println("Enter your preferred option: ");
                         String answer5 = mojo.nextLine();

                         if (answer5.equals("a") || answer5.equals("A")) {
                             total++;
                         }
                         break;

             }

         }
        if (total >= 5) {
            System.out.println("Excellent!!");
        } else if (total == 4) {
            System.out.println("very good!");
        } else if (total <= 3) {
            System.err.println("Time to brush up on your knowledge of global warming");
        }
    }
}
