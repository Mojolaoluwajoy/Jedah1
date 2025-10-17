package chapter6;

import java.security.SecureRandom;

public class RandomNumberDisplay {
    public static void main(String[] args) {

        SecureRandom randomNumber =new SecureRandom();
for (int x=1;x<= 6;x++) {
    int random = randomNumber.nextInt(5) * 3;
    System.out.println("The random number is: " + random);
}
       int  random =1 + randomNumber.nextInt(6);

         for (int i =1;i<= 6;i++){
             System.out.println(random);
             random*=random;
         }
    }

}
