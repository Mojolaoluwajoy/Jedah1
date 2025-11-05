package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
    class GuessTheNumber{
        public static void main(String[] args){
            SecureRandom random= new SecureRandom();
            Scanner mojo=new Scanner(System.in);
            boolean playAgain =true;

            while(playAgain){
                int numberToGuess=1 + random.nextInt(1000);
                int attempts =0;

                System.out.println("Guess a number between 1 and 1000");

                while(true) {
                    System.out.print("Enter your guess: ");
                    int numberGuessed=mojo.nextInt();
                    attempts++;

                    if(numberGuessed == numberToGuess){
                        System.out.println("Congratulations!!..You guessed the number in " +attempts+ "aarempts" );

                        break;
                    }
                    else if(numberGuessed < numberToGuess){
                        System.out.println("Too low..try again.");

                    }
                    else{
                        System.out.println("Too high…try again.");
                    }

                }

            }
        }


    }

