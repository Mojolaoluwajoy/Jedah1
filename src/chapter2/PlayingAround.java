package chapter2;

import java.util.Scanner;

public class PlayingAround{
           public static void main(String[] args) {
           Scanner input = new Scanner (System.in);

           int negative = 0;
           int positive = 0;
           int zero = 0;

           System.out.print("Enter the integer:");
           int number =input.nextInt();

           if (number < 0) {
           negative= negative +1;
}

          if (number  > 0) {
          positive = positive +1;


}

          if (number  == 0) {
          zero = zero +1;

}


          System.out.println("Number of negative numbers :" +negative);
          System.out.println("Number of positive numbers :" +positive);
          System.out.println("Number of zeros  :" +zero );





}




}