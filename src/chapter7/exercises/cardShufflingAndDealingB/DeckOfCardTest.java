package chapter7.exercises.cardShufflingAndDealingB;

public class DeckOfCardTest {
    public static void main(String[] args) {
        DeckOfCard myDeckOfCards = new DeckOfCard();
        myDeckOfCards.shuffle();
        Card[] player1Hand = myDeckOfCards.dealHand();
        Card[] player2Hand = myDeckOfCards.dealHand();
        System.out.println("PLAYER1 HAND");
        for (Card card : player1Hand) {
            System.out.println(card);
        }
        System.out.println("PLAYER2 HAND");

        System.out.println();
        System.out.println("HAND");
        for (Card card : player2Hand) {
            System.out.println(card);
        }
        System.out.println();
        int rank1=evaluateHand(myDeckOfCards,player1Hand);
        int rank2=evaluateHand(myDeckOfCards,player2Hand);
        if (rank1<rank2) {
            System.out.println("""
                    Player 1's hand is better than that of player 2
                    Player 1 is the winner!!""");
        } else if (rank2<rank1) {
            System.out.println("""
                              Player 2's hand is better than that of player 1
                                 Player 2 is the winner!!""");
        }  else {
            System.out.println("it's a tye!!");
        }
    }
    public static int evaluateHand(DeckOfCard deck,Card[] hand){

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
}

