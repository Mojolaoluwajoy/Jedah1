package chapter6;
import java.util.Scanner;
public class ParkingChargesTest {
    public static void main(String[] args) {
ParkingCharges parking =new ParkingCharges();
        String quitValue="";
        System.out.println("""
                ====================
                 TOLUWALASE PARKING
                ====================
                """);

        System.out.println("Kindly enter a value you'd like to use to terminate the app when your're done entering everyone's parking hour: ");
        String sentinelValue = new Scanner(System.in).nextLine();

        while (!sentinelValue.equalsIgnoreCase(quitValue)){
            parking.parkingTime();
            parking.calculateCharges();
            System.out.println("Enter any value to continue or your sentinel value to terminate: ");
            quitValue =new Scanner(System.in).nextLine();
        }
    }
    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("This exception was handled");
        }
    }
}
