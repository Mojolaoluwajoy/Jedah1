import java.util.Scanner;
public class TwoLargestNumbers{
    public static void main(String[] args) {
         int number= 0;
         int largestNumber=0;
         int secondLargestNumber=0;
         int counter =1;
         Scanner input = new Scanner(System.in);


         while (counter <= 10) {
             System.out.println("Enter an integer:");
             number = input.nextInt();

             
             if (number > largestNumber) {
                 secondLargestNumber = largestNumber;
                 largestNumber = number;


             }
            counter++;
             }
        System.out.printf("Largest number :%d%nSecond largest number:%d%n",largestNumber,secondLargestNumber);
         }


    }

