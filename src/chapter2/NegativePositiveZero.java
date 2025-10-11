package chapter2;

import java.util.Scanner;

public class NegativePositiveZero {
                public static void main (String[] args) {
                Scanner input = new Scanner (System.in);

                int negativeNumbers = 0;
                int positiveNumbers = 0;
                int zeros = 0;

                System.out.print("Enter number 1:");
                int number1 = input.nextInt();

                if (number1 < 0) {
                    negativeNumbers++;

}

                if (number1 > 0) {
                   positiveNumbers++;

}

                if (number1 == 0) {
                   zeros++;

}

                 System.out.print("Enter number 2:");
                int number2 = input.nextInt();

                if (number2 < 0) {
                    negativeNumbers++;

}

                if (number2 > 0) {
                   positiveNumbers++;

}

                if (number2 == 0) {
                   zeros++;

}

                System.out.print("Enter number 3:");
                int number3 = input.nextInt();

                if (number3 < 0) {
                    negativeNumbers++;

}

                if (number3 > 0) {
                   positiveNumbers++;

}

                if (number3 == 0) {
                   zeros++;

}

                System.out.print("Enter number 4:");
                int number4 = input.nextInt();

                if (number4 < 0) {
                    negativeNumbers++;

}

                if (number4 > 0) {
                   positiveNumbers++;

}

                if (number4 == 0) {
                   zeros++;

}

                 System.out.print("Enter number 5:");
                int number5 = input.nextInt();

                if (number5 < 0) {
                    negativeNumbers++;

}

                if (number5 > 0) {
                   positiveNumbers++;

}

                if (number5 == 0) {
                   zeros++;

}


                System.out.println("Number of negative numbers: " + negativeNumbers);
                System.out.println("Number of positive numbers: " + positiveNumbers);
                System.out.println("Number of zeros:" + zeros);


}


}