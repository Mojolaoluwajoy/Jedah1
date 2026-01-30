package chapter8.exercises.complexNumbers;

import java.util.Scanner;

public class ComplexNumbersTest {
    public static void main(String[] args) {
        ComplexNumbers complexNumbers = new ComplexNumbers();
        Scanner scanner = new Scanner(System.in);
        double realPart1 = 5;
        double realPart2 = 7;
        double imaginaryPart1 = 101;
        double imaginaryPart2 = 50;

        System.out.println(complexNumbers.addTwoComplexNumbers(realPart1,imaginaryPart1,realPart2,imaginaryPart2));
        System.out.println();
        System.out.println(complexNumbers.subtractTwoComplexNumbers(realPart1,imaginaryPart1,realPart2,imaginaryPart2));
        System.out.println();
        complexNumbers.printComplexNumbers(realPart1,imaginaryPart1,realPart2,imaginaryPart2);
    }
}
