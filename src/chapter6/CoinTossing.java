package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public enum Coin{HEADS,TAILS}

    private int headsCount=0;
    private int tailsCount=0;
    private Scanner mojo =new Scanner(System.in);
   public static final SecureRandom random =new SecureRandom();
    public Coin flip(){
        int SecureRandom = random.nextInt(2);
        return SecureRandom == 0 ? Coin.HEADS: Coin.TAILS;
    }
    public void tossCoin() {
      Coin result =flip();

      if (result == Coin.HEADS){
          headsCount++;
          System.out.println("Heads!");
      }
      else {
          tailsCount++;
          System.out.println("Tails!");
      }
            }
            public void displayResult(){
                System.out.println("Results: ");
                System.out.println("Heads: "+headsCount);
                System.out.println("Tails: "+tailsCount);
            }
            public Scanner getMojo(){
        return mojo;
            }
}