package chapter7.exercises;

import java.util.Scanner;

public class FibonacciValue {
    public static void main(String[] args) {
        System.out.println("""
                           ======================================
                                FIBONACCI NUMBER CALCULATION
                           ======================================""");
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter the value of n: ");
            int number = scanner.nextInt();
          int fibonacciValue=  fibonacci(number);
            System.out.printf("The fibonacci value of %d is %d",number,fibonacciValue);
            scanner.nextLine();
            System.out.println();
            System.out.println("Would you like to check for more number? ");
            String reply=scanner.nextLine();
            if (reply.equalsIgnoreCase("no")){
                System.out.print("Thank you for using this app,logging you out in ");
               load();

                break;
            }
        }

    }
    public static int fibonacci(int n){
        int previousFibonacci=0;
        int currentFibonacci=1;
        for (int index=0;index<n-1;index++){
            int nextFibonacci=previousFibonacci+currentFibonacci;
            previousFibonacci=currentFibonacci;
            currentFibonacci=nextFibonacci;
        }
        return currentFibonacci;
    }
    public static void delay(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
    public static void load(){
        System.out.print("1 ");
        delay();
        System.out.print("2 ");
        delay();
        System.out.print("3 ");
        delay();
        System.out.print(". ");
        delay();
        System.out.print(". ");
        delay();
        System.out.print(". ");
    }
}
