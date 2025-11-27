package chapter7.exercises;

import java.util.Scanner;

public class ModifiedFibonacciValueB {
    public static void main(String[] args) {

        System.out.println("""
                ===============================================================
                     FIBONACCI NUMBER CALCULATION UNTIL IT'S LARGEST NUMBER
                ===============================================================""");
        Scanner scanner = new Scanner(System.in);
        double number = 0.1;
        double fibonacciValue=0;

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

    public static double fibonacci(double n) {
        double previousFibonacci = 0;
        double currentFibonacci = 1;
        if (n<=1){
            return  n;
        }
        for (int index = 0; index < n - 1; index++) {
            double nextFibonacci = previousFibonacci + currentFibonacci;
            if (Double.isInfinite(currentFibonacci)){
                throw new ArithmeticException("overflow");
            }
            previousFibonacci = currentFibonacci;
            currentFibonacci = nextFibonacci;
        }
        return previousFibonacci;
    }
}

