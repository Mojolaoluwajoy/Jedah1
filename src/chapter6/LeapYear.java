package chapter6;

import java.util.Scanner;

public class LeapYear {
    private int yearInput;
    private int isLeapYear;
    private int year;

    public void yearInput() {
        System.out.println("Kindly enter the year you'd like to check: ");
         year =new Scanner(System.in).nextInt();
    }
    public void isLeapYear() {
        if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0 ){
            System.out.println("The year "+year+ " is a leap year");
        }
        else {
            System.out.println("The year "+year+" is not a leap year!");
        }
    }
}
