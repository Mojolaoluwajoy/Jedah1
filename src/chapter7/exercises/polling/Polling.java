package chapter7.exercises.polling;

import java.util.Scanner;

public class Polling {
    public static String[] causes={"FEMICIDE","POVERTY","HUMAN RV","CORRUPTION","INEQUALITY"};
    public static int[][] responsesArray=new int[5][10];

    public static void displayMessage(Scanner scanner) {
        System.out.println("""
                          ==================
                          JEDAH CAUSES POLE
                          ==================
                Welcome to this this polling system.
                Five topics will be displayed on your screen shortly and
                you'll be prompted to rate them between 1 and 10,
                with 1 signifying the least important and 10 the most important""");
        System.out.println();
    }
    public static int[][] getXRates(Scanner scanner){
        displayMessage(scanner);
        delay();
        int counter=0;
   for (int causeIndex=0;causeIndex<causes.length;causeIndex++) {
      displayQuestions();
      System.out.println("Kindly rate the number"+(causeIndex+1)+" cause on the list");
       int rateNumber=scanner.nextInt();
        responsesArray[counter][causeIndex]++;
        counter++;
    }
   return responsesArray;
    }
    public static void delay(){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){

        }
    }
    public static void displayQuestions(){
        System.out.println("  THE CAUSES");
        for (int index=0;index<causes.length;index++){
            System.out.println((index+1)+"."+causes[index]);
        }
    }
    public static void displayTable(){
       skip();
        System.out.printf("%2s","CAUSES");
        for (int numberIndex=1;numberIndex<=10;numberIndex++) {
            if (numberIndex == 1) {
                System.out.printf("%15d", numberIndex);
            } else {
                System.out.printf("%7d", numberIndex);
            }
        }
            System.out.println();
            System.out.println();


            for (int rowIndex = 0; rowIndex <causes.length; rowIndex++){
                System.out.print((rowIndex + 1) + "." + causes[rowIndex]);

                for (int columnIndex = 0; columnIndex< responsesArray[rowIndex].length; columnIndex++){
                   System.out.printf("%-10d",responsesArray[rowIndex][columnIndex]);


            }
            System.out.println();}
        }

public static void skip(){
    System.out.println("""
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            """);
}
}
