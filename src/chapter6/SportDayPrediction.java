package chapter6;

import java.util.Scanner;

public class SportDayPrediction {
    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);
        int temperature =0;
        int quitnumber =0;
        SportDay sport =new SportDay();
        System.out.println("""
                ===========================
                BAIL YOU WEATHER PREDICTION
                ===========================
                Over here,we take the weather temperature in celsius and tell you how fitting the day will be for sports""");

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {

        }
        System.out.println("Kindly enter a value to indicate you're ready to exit the app: ");
        int sentinelNumber=mojo.nextInt();


        while (sentinelNumber != quitnumber){
           sport.temperature();
           sport.sportsRecommender();

            System.out.println("Indicate if you'd like to exit or get more recommendations: ");
            quitnumber=mojo.nextInt();

       }
    }

}
