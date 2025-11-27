package chapter7.exercises;

import java.util.Scanner;

public class AirlineReservationSystem {
    int ticketClass;
    int seatNumber = 0;
    Scanner scanner = new Scanner(System.in);
    boolean[] seatsTaken = new boolean[10];


    public int getBoardingPreference() {

        while (true) {
            System.out.println("""
                          ===================
                             JEDAH AIRLINE
                           ===================
                      Welcome to JEDAH airline services
                    """);
            ticketLoad();
            System.out.println("""
                    Kindly Enter;
                      1.For First Class
                      2.For Economy
                    """);

            ticketClass = scanner.nextInt();
            if (ticketClass > 0 && ticketClass < 3) {
                break;
            } else {
                System.out.println("Invalid input!The only available options are 1 and 2.");

            }
        }
        return ticketClass;
    }

    public void printBoardPass() {
       // int ticketClass = getBoardingPreference();

        int firstClass = 6;
        int economy = 11;


        while (seatNumber <= 10) {
            getBoardingPreference();

            if (ticketClass == 1) {
                for (int ticketIndex = 1; ticketIndex < firstClass; ticketIndex++) {
                    if (!seatsTaken[ticketIndex]) {
                        seatsTaken[ticketIndex] = true;
                        load();
                        System.out.println("""
                                   ===============
                                    BOARDING PASS
                                   ===============
                                You picked first class.
                                Your seat number is"""+" " + ticketIndex);
                        seatNumber++;
                        delay();
                        delay();
                        delay();
                        skip();
                        break;
                    }
                }
            } else if (ticketClass == 2) {
                for (int ticketIndex = 6; ticketIndex <= economy; ticketIndex++) {
                    if (!seatsTaken[ticketIndex]) {
                        seatsTaken[ticketIndex] = true;
                         load();
                        System.out.println("""
                                ===============
                                 BOARDING PASS
                                ===============
                                You picked second class.
                                Your seat number is""" +" "+ ticketIndex);
                        seatNumber++;
                        delay();
                        delay();
                        delay();
                        delay();
                        delay();
                        skip();
                        break;
                    }
                }
            }
        }
    }


    public static void skip() {
        System.out.println("""
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                """);
    }
    public  static void miniSkip(){
        System.out.println("""
                
                
                
                """);
    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public static void load() {
        System.out.print("Your boarding pass is loading.");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
        delay();
        System.out.println();

    }
    public static void ticketLoad(){
        System.out.print("Hold on while we load the ticket options.");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
        System.out.println();
    }
}