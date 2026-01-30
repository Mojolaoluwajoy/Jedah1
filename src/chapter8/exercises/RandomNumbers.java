package chapter8.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SecureRandom random=new SecureRandom();
        System.out.print("Kindly enter the amount of random numbers you'd like to generate: ");
        int n=scanner.nextInt();

        for (int index=0;index<n;index++){
            int number=random.nextInt(10,100);
            if( index !=0 && index % 5==0){
                System.out.println();

            }
            System.out.print(number+" ");

        }
    }
}
