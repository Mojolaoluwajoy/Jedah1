package chapter5;
import java.util.Scanner;

public class TwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in) ;
        int number;
        do {
            System.out.println("Kindly enter the number 12:");
            number= mojo.nextInt();
            if(number!=12) {
                System.err.println("Invalid input!Please enter the number 12!");
            }
        }
        while (number !=12);

        int switchIndex;
        for (switchIndex =1; switchIndex <=number; switchIndex++) {
        switch (switchIndex) {
            case 1:
                System.out.print("On the first day ");
                break;

            case 2:
                System.out.print("On the second day ");
                break;

            case 3:
                System.out.print("On the third day ");
                break;

            case 4:
                System.out.print("On the fourth day ");
                break;

            case 5:
                System.out.print("On the fifth day ");
                break;

            case 6:
                System.out.print("On the sixth day ");
                break;

            case 7:
                System.out.print("On the seventh day ");
                break;

            case 8:
                System.out.print("On the eighth day ");
                break;

            case 9:
                System.out.print("On the ninth day ");
                break;

            case 10:
                System.out.print("On the tenth day ");
                break;

            case 11:
                System.out.print("On the eleventh day ");
                break;

            case 12:
                System.out.print("On the twelfth day ");
                break;
        }
            System.out.print("of christmas my true love sent to me,");

            switch (switchIndex) {
                case 1:
                    System.out.println("a partridge in a pear tree. ");
                    break;

                case 2:
                    System.out.println("two turtle doves.");
                    break;

                case 3:
                    System.out.println("three french hens ");
                    break;

                case 4:
                    System.out.println("four curly birds. ");
                    break;

                case 5:
                    System.out.println("five golden rings ");
                    break;

                case 6:
                    System.out.println("six geese are laying. ");
                    break;

                case 7:
                    System.out.println("seven swans are swimming. ");
                    break;

                case 8:
                    System.out.println("eight maids are milking.");
                    break;

                case 9:
                    System.out.println("nine ladies dancing. ");
                    break;

                case 10:
                    System.out.println("ten lords are leaping");
                    break;

                case 11:
                    System.out.println("eleven pipers pipping.");
                    break;

                case 12:
                    System.out.println("twelve drummers drumming.");
                    break;
            }

        }
    }
}
