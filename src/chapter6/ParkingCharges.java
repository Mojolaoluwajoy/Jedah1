package chapter6;
import java.util.Scanner;
public class ParkingCharges {
    private double parkingTime;
    private double hour;
    private double calculateCharges;
    private double charges;
    private double totalCharges;
    private double totalHours;
    Scanner mojo=new Scanner(System.in);



    public void parkingTime( ){
        while (true){
            System.out.println("Enter your parking time to get your charges: ");
            hour= mojo.nextInt();

             if (hour<=24){
                System.out.println("Your parking time has been recorded successfully,hold on a bit while we print your charges");

                ParkingChargesTest.sleep();

                 break;
            }
            else {
                System.out.println("Unacceptable hours,you can only park for 24hrs max!");
            }
        }
    }
    public void  calculateCharges() {
        if (hour == 1){
            charges =0.50;
            System.out.println("Your charges for "+hour+ " is "+charges);
        } else if (hour ==3) {
            charges =2.00;
            System.out.println("Your charges for "+hour+ " is "+charges);

        } else if (hour ==24) {
            charges =10.00;
            System.out.println("Your charges for "+hour+ " is "+charges);

        }
        else {
            charges =hour * 0.50;
            System.out.println("Your charges for "+hour+ " is "+charges);


        }
        totalHours +=hour;
        totalCharges+=charges;
        System.out.println("The total charges entered for "+totalHours+ " hours is "+totalCharges);


    }
}
