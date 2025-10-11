package chapter3;

public class HealthProfileTest {
          public static void main (String[] args) {

          HealthProfile health = new HealthProfile("Omobolanle","Adebola","Female","21/07/1992",21,07,1992,61,123);


         System.out.println("AN INDIVIDUAL'S HEALTH PROFILE");

         System.out.printf("FIRST NAME: %s%n LAST NAME: %s%n GENDER: %s%n DOB: %s%n HEIGHT: %dinches%n WEIGHT: %dpounds%n Age: %d%n BMI: %.2f%n MAXIMUM HEART RATE: %d%n TARGET HEART RATE RANGE: %.2f - %.2f",
                           health.getFirstName(),health.getLastName(),health.getGender(),health.getDateOfBirth(),health.getHeight(),health.getWeight(),health.calculateAge(),health.bmi(),health.maximumHeartRate(),health.targetHeartRateLower(),health.targetHeartRateUpper());




}
                  



}