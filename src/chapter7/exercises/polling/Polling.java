package chapter7.exercises.polling;

import java.util.Scanner;

public class Polling {
    public static String[] causes={"FEMICIDE","POVERTY","HUMAN RV","CORRUPTION","INEQUALITY"};
   private static int[][] responsesArray=new int[5][10];
   private static double[] averageArray=new double[responsesArray.length];
private static int ratingsCount;
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
    public static int getXRatings(Scanner scanner,int causeIndex){
       int userRatings;
       while (true) {
            System.out.println("Kindly rate the number " + (causeIndex + 1) + " cause on the list");
            userRatings = scanner.nextInt();
            if (userRatings>0&&userRatings<=10) {
                 break;
            }
            else {
                System.err.println("Invalid response!Rating is between 1 -10");
            }
        }
return userRatings;

    }
    public static void storeRatings(Scanner scanner){
        displayMessage(scanner);
        delay();

        int counter=0;

                for (int causeIndex=0;causeIndex<causes.length;causeIndex++) {

               displayPoll();
              int userRatings= getXRatings(scanner,causeIndex);
                    responsesArray[causeIndex][userRatings-1]+=1;

                }

     }

    public static void delay(){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){

        }
    }
    public static void displayPoll(){
        System.out.println("  THE CAUSES");
        for (int index=0;index<causes.length;index++){
            System.out.println((index+1)+"."+causes[index]);
        }
    }
    public static void displayTable() {
        System.out.println("""             
                                                    ========================
                                                            POLL RESULT
                                                    ========================""");
        System.out.printf("%-15s", "CAUSES");
        for (int numberIndex = 1; numberIndex <= 10; numberIndex++) {
            if (numberIndex == 1) {
                System.out.printf("%15d", numberIndex);
            } else {
                System.out.printf("%7d", numberIndex);
            }
        }
        System.out.printf("%12s", "AVERAGE");
        System.out.println();
        System.out.println();


        for (int rowIndex = 0; rowIndex < causes.length; rowIndex++) {
            System.out.printf("%d,%-15s", (rowIndex + 1), causes[rowIndex]);

            for (int columnIndex = 0; columnIndex < responsesArray[rowIndex].length; columnIndex++) {
                if (columnIndex % 10 == 0) {
                    System.out.printf("%12d", responsesArray[rowIndex][columnIndex]);
                } else {
                    System.out.printf("%7d", responsesArray[rowIndex][columnIndex]);
                }

            }
            double[] average = averageCalculation();
            System.out.printf("%10.2f", average[rowIndex]);


            System.out.println();
        }
        printLowestAndHighest();
    }
    public static void printLowestAndHighest(){
        int highestPoint=Integer.MIN_VALUE;
        int lowestPoint=Integer.MAX_VALUE;
        String highestCause=" ";
        String lowestCause=" ";
        boolean isDuplicateHighest=false;
        boolean isDuplicateLowest=false;
       int[] totalPoint=totalPointCalculation();
        for (int index=0;index<causes.length;index++){
          int point=totalPoint[index] ;

          if (point>highestPoint){
              highestPoint=point;
              highestCause=causes[index];
              isDuplicateHighest=false;
          }else if (point==highestPoint){
              highestCause+=", "+causes[index];
              isDuplicateHighest=true;
          }
          if (point<lowestPoint){
              lowestPoint=point;
              lowestCause=causes[index];
              isDuplicateLowest=false;
          }else if (point==lowestPoint){
              lowestCause+=", "+causes[index];
              isDuplicateLowest=true;
          }

        }

        System.out.println(
               "The "+ (isDuplicateHighest? "causes " : "cause")+"with the highest point "+(isDuplicateHighest? "are: "+highestCause: "is: "+highestCause)+" with a total point of "+highestPoint
               );
        System.out.println(
               "The "+ (isDuplicateLowest? "causes " : "cause")+"with the lowest point "+(isDuplicateLowest? "are: "+lowestCause: "is: "+lowestCause)+" with a total point of "+lowestPoint
               );

    }

        public static double[] averageCalculation(){
        for (int rowIndex=0;rowIndex<responsesArray.length;rowIndex++) {
            double sum = 0;
            int totalVotes = 0;
            for (int columnIndex=0;columnIndex<responsesArray[rowIndex].length;columnIndex++ ){
                int count=responsesArray[rowIndex][columnIndex];
                sum+=(columnIndex+1)*count;
                totalVotes+=count;
            }
            if (totalVotes>0) {
                averageArray[rowIndex]=sum/totalVotes;
            }
        }
        return averageArray;
    }
    public static int [] totalPointCalculation() {
        int [] totalPoints=new int[responsesArray.length];
        for (int rowIndex = 0; rowIndex < responsesArray.length; rowIndex++) {
            int totalSum=0;
           // int totalVotes = 0;
            for (int columnIndex = 0; columnIndex < responsesArray[rowIndex].length; columnIndex++){
                int count = responsesArray[rowIndex][columnIndex];
                totalSum+=(columnIndex+1)*count;
               // totalVotes += count;
            }
            System.out.println("Total Points for CAUSE"+(rowIndex+1)+": "+totalSum);
            totalPoints[rowIndex]=totalSum;
        }
        return totalPoints;
    }
public static void skip(){
    System.out.println("""
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            """);
}
}
