package classworks.multiplicationGameWithArray;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiplication {
    private static int counter;
    private final String sentinelValue="done";
    ArrayList <String>  answerStorage=new ArrayList<>();
   ArrayList <Integer>question1Storage =new ArrayList<>();
   ArrayList <Integer> question2Storage =new ArrayList<>();
     ArrayList <String> rightOrWrongAnswer=new ArrayList<>();
    SecureRandom random=new SecureRandom();

    public void displayMessage(){
        System.out.println("""
                           =======================
                             MULTIPLICATION GAME
                           =======================
                           Welcome to Multiplication Game!
                           Type "done" anytime to end the game.""");
        System.out.println();
    }
    public  void playGame(Scanner scanner){
        displayMessage();
        counter=0;
        String response=" ";
        int answer=0;
        while (!response.equalsIgnoreCase(sentinelValue)) {
            int firstNumber = random.nextInt(1, 20);
            int secondNumber = random.nextInt(1, 20);

            System.out.println((counter+1)+".What is "+firstNumber+" * "+ secondNumber+"?");
            response =scanner.nextLine();
            if (response.equalsIgnoreCase(sentinelValue)){
                System.out.println("Game Over!");
                disPlayResults();
                break;
            }
else {
                  question1Storage.add(firstNumber);
                  question2Storage.add(secondNumber);
                  answerStorage.add(response) ;
               answer = Integer.parseInt(response);
            }
            if (answer ==firstNumber*secondNumber){
                rightOrWrongAnswer.add("Correct Answer");
            }
            else {
                rightOrWrongAnswer.add("Wrong Answer");
            }
            System.out.println();
            counter++;

        }
    }
    public void disPlayResults(){
        System.out.println("Here are your Responses:");
        for (int index=0;index<counter;index++){
            System.out.println((index+1)+"."+ question1Storage.get(index)+" * "+ question2Storage.get(index)+"="+answerStorage.get(index));
            System.out.println(rightOrWrongAnswer.get(index));
            System.out.println();
        }
        System.out.println("Thank you for playing!");
    }
}
