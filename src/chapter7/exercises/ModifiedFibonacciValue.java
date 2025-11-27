package chapter7.exercises;

import java.util.Scanner;

public class ModifiedFibonacciValue {
    public static void main(String[] args) {
        System.out.println("""
                           ======================================
                                FIBONACCI NUMBER CALCULATION
                           ======================================""");
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter the decimal value of n: ");
            float number = scanner.nextFloat();
            float fibonacciValue=  fibonacci(number);
            System.out.printf("The fibonacci value of %f is %.3f",number,fibonacciValue);
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
    public static float fibonacci(float n){
        float previousFibonacci=0;
        float currentFibonacci=1;
        for (int index=0;index<n-1;index++){
            float nextFibonacci=previousFibonacci+currentFibonacci;
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

