package chapter5;
import java.util.Scanner;

public class TheFairTax {
    public static void main(String[] args) {

        Scanner mojo = new Scanner(System.in);

        int counter;
        double originalPrices=0;
        double expenses=0;
        double taxAmount=0;
        double totalPrice=0;


        for (counter=1;counter<=7;counter++){

            if (counter==1){
                System.out.println("Kindly enter the expenses for housing:");
                expenses = mojo.nextDouble();
            }
            else if (counter==2){
                System.out.println("Enter the expenses for food:");
                expenses = mojo.nextDouble();
            }
            else if (counter==3){
                System.out.println("Enter the expenses for clothing:");
                expenses = mojo.nextDouble();
            }
            else if (counter==4){
                System.out.println("Enter the expenses for transportation:");
                expenses = mojo.nextDouble();
            }
            else if (counter==5){
                System.out.println("Enter the expenses for education:");
                expenses = mojo.nextDouble();
            }
            else if (counter==6){
                System.out.println("Enter the expenses for health-care:");
                expenses = mojo.nextDouble();
            }
            else if (counter==7){
                System.out.println("Enter the expenses for vacation:");
                expenses = mojo.nextDouble();
            }
            originalPrices +=expenses;
            double taxRate = 23;
            double convertedTaxRate=taxRate/100;
            taxAmount=expenses * convertedTaxRate ;
            totalPrice=originalPrices + taxAmount;
        }
        System.out.println("The original price of all the expenses is: $"+originalPrices );
        System.out.printf("The tax amount to be paid on $%.4f is: $%.4f%n",originalPrices,taxAmount);
        System.out.println("The total price of all expenses added to the tax amount to be paid is: $"+totalPrice);
    }
}
