package chapter11.exercises.customEception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        prompt("Kindly enter a name: ");
        String name=scanner.nextLine();

        prompt("Kindly enter a 16 Character serialNumber: ");
        String serialNumber=scanner.nextLine();

        Phone phone=new Phone(name,serialNumber);
    }
    public static void prompt(String message){
        System.out.println(message);
    }
}
