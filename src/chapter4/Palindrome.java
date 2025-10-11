package chapter4;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Enter a five digit number:");
            num = scanner.nextInt();

            if (num >= 10000 && num <= 99999) {
                break;
            } else {
                System.out.println("Invalid input,please enter a five digit number: ");
            }
        }
            int tempNum = num;
            int reversedNum = 0;

            while (tempNum != 0) {
                int digit = tempNum  % 10;

                reversedNum = reversedNum * 10 + digit;
                tempNum  /= 10;
            }

            if (num  == reversedNum) {
                System.out.println(num + "is a palindrome!");
            } else {
                System.out.println(num + "is not a palindrome!!");

            }

        }
    }