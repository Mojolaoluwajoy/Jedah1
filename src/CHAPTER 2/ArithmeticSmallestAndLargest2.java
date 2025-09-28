import java.util.Scanner;

public class ArithmeticSmallestAndLargest2{
              public static void main(String[] args) {
              Scanner input = new Scanner (System.in);

              System.out.print("Enter the motherfucking first integer bitch:");
              int number1 = input.nextInt();

              System.out.print("Enter the motherfucking second integer bitch:");
              int number2 = input.nextInt();

              System.out.print("Enter the motherfucking third integer mi amor:");
              int number3 = input.nextInt();

              int sum = number1 + number2 + number3;
              System.out.printf("Sum is %d%n", sum);

             int average = sum/3;
             System.out.printf("Average is %d%n", average);

             int product = number1 * number2 * number3;
             System.out.printf("Product is %d%n", product);


             if (number1 > number2) {
                System.out.printf("%d > %d%n", number1, number2);

}

             if (number1 > number3) {
                System.out.printf("%d > %d%n", number1, number3);

}

            if (number2 > number1) {
                System.out.printf("%d > %d%n", number2, number1);

}

            if (number2 > number3) {
                System.out.printf("%d > %d%n", number2, number3);

}

            if (number3 > number1) {
                System.out.printf("%d > %d%n", number3, number1);

}

           if (number3 > number2) {
                System.out.printf("%d > %d%n", number3, number2);

}


                    










}


}