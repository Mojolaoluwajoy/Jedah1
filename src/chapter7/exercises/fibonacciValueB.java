package chapter7.exercises;

import java.util.Scanner;

public class fibonacciValueB {
    public static void main(String[] args) {

        System.out.println("""
                ===============================================================
                     FIBONACCI NUMBER CALCULATION UNTIL IT'S LARGEST NUMBER
                ===============================================================""");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        long fibonacciValue=0;

        while (true) {
            try {
                fibonacciValue = fibonacci(number);
                System.out.println("The fibonacci(" +number+ ")= "+fibonacciValue);
                number++;
            } catch (ArithmeticException e) {
                System.out.println("The largest fibonacci number that can be printed is: "+fibonacciValue+ " at "+(number-1)+" number.");
break;

            }
        }
    }

    public static long fibonacci(int n) {
        long previousFibonacci = 0;
        long currentFibonacci = 1;
        if (n<=1){
            return  n;
        }
        for (int index = 0; index < n - 1; index++) {
            long nextFibonacci = previousFibonacci + currentFibonacci;
            if (nextFibonacci<0){
                throw new ArithmeticException("overflow");
            }
            previousFibonacci = currentFibonacci;
            currentFibonacci = nextFibonacci;
        }
        return currentFibonacci;
    }
 }
