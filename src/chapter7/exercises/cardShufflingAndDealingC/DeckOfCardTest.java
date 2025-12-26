package chapter7.exercises.cardShufflingAndDealingC;

public class DeckOfCardTest { public static void main(String[] args) {
    DeckOfCard myDeckOfCards = new DeckOfCard();
    myDeckOfCards.shuffle();
    Card[] playerHand = myDeckOfCards.dealHand();
    System.out.println("PLAYER HAND");
    for (Card card : playerHand) {
        System.out.println(card);
    }

    System.out.println();
     Card[] dealerHand=myDeckOfCards.evaluateAndDraw(myDeckOfCards);
    System.out.println();
    int playerRank = evaluateHandName(myDeckOfCards,playerHand);
    int dealerRank = evaluateHandName(myDeckOfCards,dealerHand);
    if (playerRank < dealerRank) {
        System.out.println("""
                    Player's hand is better than that of dealer's
                    Player is the winner!!""");
    } else if (dealerRank < playerRank) {
        System.out.println("""
                             Dealer's hand is better than that of player's
                                 Dealer is the winner!!""");
    }  else {
        System.out.println("it's a tye!!");
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
}

