import java.util.Scanner;

public class ComparingIntegers2{
                   public static void main(String[] args) {
                   Scanner input = new Scanner (System.in);

                   System.out.print("Enter the integer");
                   int number = input.nextInt();

                   int square = number * number;
                   System.out.printf("Square is %d%n", square);

                    System.out.println("Comparing number to 100");
                   if (number > 100) {
                      System.out.printf("%d > %d%n", number, 100);

}

                  if (number < 100) {
                     System.out.printf("%d < %d%n", number, 100);

}

                  if  (number == 100) {
                     System.out.printf("%d == %d%n", number, 100);

}

                  if (number != 100) {
                     System.out.printf("%d != %d%n", number, 100);

}
                  
                    System.out.println("Comparing square to 100");
                   if (square > 100) {
                      System.out.printf("%d > %d%n", square, 100);

}

                  if (square < 100) {
                     System.out.printf("%d < %d%n", square, 100);

}

                  if  (square == 100) {
                     System.out.printf("%d == %d%n", square, 100);

}

                  if (square != 100) {
                     System.out.printf("%d != %d%n", square, 100);

}




}





}
                   