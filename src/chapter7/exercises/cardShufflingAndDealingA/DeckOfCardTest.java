package chapter7.exercises.cardShufflingAndDealingA;

public class DeckOfCardTest {
    public static void main(String[] args) {
        DeckOfCard myDeckOfCards =new DeckOfCard();
        myDeckOfCards.shuffle();
        Card[] hand = myDeckOfCards.dealHand();

        System.out.println("HAND");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();
        if (myDeckOfCards.isPair(hand)) {
            System.out.println("The Hand dealt contains a pair");
        } else if (myDeckOfCards.isTwoPairs(hand)) {
            System.out.println("The Hand dealt contains two pairs");
        } else if (myDeckOfCards.isThreeOfAKind(hand)) {
            System.out.println("The Hand dealt contains three of a kind");
        } else if (myDeckOfCards.isFourOfAKind(hand)) {
            System.out.println("The Hand dealt contains four of a kind");
        } else if (myDeckOfCards.isFlush(hand)) {
            System.out.println("The Hand dealt contains a flush");
        } else if (myDeckOfCards.isStraight(hand)) {
            System.out.println("The Hand dealt contains a straight");
        } else if (myDeckOfCards.fullHouse(hand)) {
            System.out.println("The Hand dealt contains a full house");
        } else {
            System.out.println("The Hand dealt doesn't contain any of the matches");
        }

    }

}
