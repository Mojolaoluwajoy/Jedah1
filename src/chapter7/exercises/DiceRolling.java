package chapter7.exercises;

import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
    Random random =new Random();
Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

generateTallyAndPrintResult();
    }

    public static void generateTallyAndPrintResult(){
        Random random =new Random();
int sum =0;
        int numberOfRoll=36_000_000;
        int [] resultFrequency=new int[11];
        for (int index=0;index<=numberOfRoll;index++) {
            int firstNumber = random.nextInt(1, 7);
            int secondNumber = random.nextInt(1, 7);
            sum =firstNumber+secondNumber;
          resultFrequency [sum-2]++;
        }
        System.out.println("SUM\tFREQUENCY");
        for (int index=0;index<resultFrequency.length;index++){
            System.out.printf("%d\t%d\t",index+2,resultFrequency[index]);
            System.out.println();
        }
       }
}
