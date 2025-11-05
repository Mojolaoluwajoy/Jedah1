package chapter6;

import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYear leap = new LeapYear();
        int sentinel =0;
int quitValue = 0;
int sentinelValue= -5;
        System.out.println("""
                This App aims at helping you determine weather a year is leap or not
                You are allowed to inquire about as many years as you want
                To stop the program from running,simply enter -5 and you would be exited from the program.""");

       try {
           Thread.sleep(1000);
       }
       catch (InterruptedException e) {
           System.out.println("This exception was interrupted");
       }
        while (sentinelValue != quitValue){
            leap.yearInput();
            leap.isLeapYear();
            System.out.println("Enter a value to proceed or your Sentinel value to terminate: ");
           quitValue=new Scanner(System.in).nextInt();
        }
    }
}
