package chapter7.exercises.cardShufflingAndDealingD;

import java.util.Scanner;

public class DeckOfCardTest { public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    DeckOfCard myDeckOfCards = new DeckOfCard();
    int playerWinCount=0;
    int dealerWinCount=0;
    int tyeCount=0;
    System.out.println("Kindly enter your name,so you can be registered as the player:" );
    String name= scanner.nextLine();
    System.out.println(name+" successfully registered as the player");
    load();
    System.out.println();
    for (int playIndex = 0; playIndex < 20; playIndex++) {

        System.out.println("""
                              ==========
                                ROUND"""+" "+(playIndex+1)+"!!!" );
        System.out.println( """
                              ==========""");
        myDeckOfCards.shuffle();
        Card[] playerHand = myDeckOfCards.dealHand();
        while (true) {
            System.out.println(name + " press enter to draw your hand");
            String play = scanner.nextLine();
            if (play.equals("")) {
                break;
            } else {
                System.err.println(" Invalid input!");
                }
        }
        System.out.println(name+" HAND");
        for (Card card : playerHand) {
            System.out.println(card);
        }
        System.out.println();
        System.out.println("Computer playing....");
        delay();
        Card[] dealerHand = myDeckOfCards.evaluateAndDraw(myDeckOfCards);
        int playerRank = evaluateHandName(myDeckOfCards, playerHand);
        int dealerRank = evaluateHandName(myDeckOfCards, dealerHand);
        if (playerRank < dealerRank) {
            System.out.println(name+"""
                     hand is better than that of dealer's
                   you win this round!!""");
            playerWinCount+=1;
            delay();
            System.out.println();
        } else if (dealerRank < playerRank) {
            System.out.println("""
                    Dealer's hand is better than that of player's
                        Dealer wins this round!!""");
            dealerWinCount+=1;
            delay();
            System.out.println();
        } else {
            System.out.println("it's a tye!!");
            tyeCount+=1;
            System.out.println();
        }
    }
    delay();
    delay();
    skip();
    if (playerWinCount>dealerWinCount){
        System.out.println(name+" Congratulations,you scored "+playerWinCount+" out of 20");
        System.out.println("And the total tye in the game is:"+tyeCount);
    }else if (dealerWinCount>playerWinCount){
        System.out.println("The computer wins! with a total score of "+dealerWinCount+" out of 20");
        System.out.println("And the total tye in the game is:"+tyeCount);
    }else {
        System.out.println("It's a TYE!!!!" +
                "And the total tye in the game is:"+tyeCount);

    }
}
    public static int evaluateHandName(DeckOfCard deck, Card[] hand){

        if (deck.isFourOfAKind(hand)){
            return 1;
        }
        if (deck.fullHouse(hand)){
            return 2;
        }
        if (deck.isFlush(hand)){
            return 3;
        }
        if (deck.isStraight(hand)){
            return 4;
        }
        if (deck.isThreeOfAKind(hand)){
            return 5;
        }if (deck.isTwoPairs(hand)){
            return 6;
        }
        if (deck.isPair(hand)){
            return 7;
        }
        return 8;
    }
    public static int evaluateHand(Card[] hand){
    int value=0;
    for (Card card:hand){
        String face=card.getFace();
        if (face.equalsIgnoreCase("Ace")){
            value+=1;
        }else if (face.equalsIgnoreCase("Deuce")){
            value+=2;
        }else if (face.equalsIgnoreCase("Jack")|| face.equalsIgnoreCase("Queen")|| face.equalsIgnoreCase("King")){
            value+=10;
        } else {
           value+=0;//Integer.parseInt(face);
        }
    }
    if (value<15){
        return 3;
    }else if (value<20){
        return 2;
    }else{
        return 1;
    }
    }
    public static void delay(){
    try {
        Thread.sleep(1000);
    }catch (InterruptedException e){}
    }
    public static void skip(){
        System.out.println("""
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                """);
    }
    public static void load(){
        System.out.print("Game begins in 1 ");
        delay();
        System.out.print("2 ");
        delay();
        System.out.print("3 ");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
        delay();
        System.out.print(".");
    }
}

