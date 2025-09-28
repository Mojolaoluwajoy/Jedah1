import java.util.Scanner;

public class BMICalculator{
                  public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
       
                  System.out.print("Enter your weight in pounds: "); 
                  double weight = input.nextDouble();

                  System.out.print("Enter your height in inches: ");
                  double height = input.nextDouble();

                  double bmi = (weight * 703) / (height * height);

                  System.out.printf("Your BMI is : %2f%n ", bmi);

                  if (bmi < 18.5) {
                      System.out.println("you are underweight love,you need more meat on your skinny bone.");

}

                  if (bmi >= 18.5 && bmi < 25) {
                     System.out.println("You are normal weight cutesy,keep doing exactly what youve been doing.");

}

                  if (bmi >= 25 && bmi <30) {
                     System.out.println("You are overweight mama,you need to start eating healthy.");

}

                  if (bmi >= 30) {
                     System.out.println("Not to be the bearer of bad news sweets,but you are definitely obese!");

}

                  System.out.println("The following are the BMI categories pretty: ");
                  System.out.println("Underweight: BMI < 18.5");
                  System.out.println("Normal weight: BMI = 18.5-24.9");
                  System.out.println("Overweight: BMI = 25-29.9");
                  System.out.println("Obese: BMI >= 30");













}



}