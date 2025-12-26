package chapter7.exercises.cardShufflingAndDealingA;

import java.security.SecureRandom;

public class DeckOfCard {
    private static SecureRandom randomNumbers=new SecureRandom();
    private static final int NUMBER_OF_CARDS=52;

    private Card[] deck =new Card[NUMBER_OF_CARDS];
    private int currentCard=0;

    public DeckOfCard(){
        String[] faces ={"Ace","Deuce","Three", "Four","Five","Six",
                "Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits ={"Hearts", "Diamonds","Clubs", "Spades"};

        for (int count =0;count<deck.length;count++){
            deck[count]=
                    new Card(faces[count % 13],suits[count/13]);
        }
    }
    public void shuffle(){
        currentCard=0;
        for (int first=0;first<deck.length;first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp= deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    public Card dealCard(){

        if (currentCard<deck.length){
            return deck[currentCard++];
        }
        else {}
        return null;
    }
    public Card[] dealHand(){
        Card [] hand=new Card[5];
        for (int index=0;index<5;index++){
            hand[index]=dealCard();
        }
        return hand;
    }
    public boolean isPair(Card[] hand){
        String[] faces=new String[5];
        for (int index=0;index<faces.length;index++){
            faces[index]=hand[index].getFace();
        }
        for (String face: faces){
            int count=0;
            for (String f:faces){
                if (f.equals(face)){
                    count++;
                }
            }
            if (count==2){
                return true;
            }
        }
        return false;
    }
    public boolean isTwoPairs(Card[] hand){
        String[] faces=new String[5];
        for (int index=0;index<faces.length;index++){
            faces[index]=hand[index].getFace();
        }
        int pairCount=0;
        for (String face: faces){
            int count=0;
            for (String f:faces){
                if (f.equals(face)){
                    count++;
                }
            }
            if (count==2){
                pairCount++;
            }
        }
        return pairCount==2;
    }
    public boolean isThreeOfAKind(Card[] hand){
        String[] faces=new String[5];
        for (int index=0;index<faces.length;index++){
            faces[index]=hand[index].getFace();
        }
        for (String face: faces){
            int count=0;
            for (String f:faces){
                if (f.equals(face)){
                    count++;
                }
            }
            if (count==3){
                return true;
            }
        }
        return false;
    }
    public boolean isFourOfAKind(Card[] hand){
        String[] faces=new String[5];
        for (int index=0;index<faces.length;index++){
            faces[index]=hand[index].getFace();
        }
        for (String face: faces){
            int count=0;
            for (String f:faces){
                if (f.equals(face)){
                    count++;
                }
            }
            if (count==4){
                return true;
            }
        }
        return false;
    }
    public boolean isFlush(Card[] hand){
        String suit=hand[0].getSuit();
        for (int index=0;index<5;index++){
            if (!hand[index].getSuit().equals(suit)){
                return false;
            }
        }
        return true;
    }
    public boolean isStraight(Card[] hand){
        String[] faces={"Ace","Deuce","Three", "Four","Five","Six",
                "Seven","Eight","Nine","Ten","Jack","Queen","King"};
        int [] faceValue=new int[5];
        for (int indexOne = 0; indexOne <5; indexOne++){
            for (int indexTwo=0;indexTwo<13;indexTwo++){
                if (hand[indexOne].getFace().equals(faces[indexTwo])){
                    faceValue[indexOne]=indexTwo;
                }
            }
        }
        java.util.Arrays.sort(faceValue);
        for (int index=0;index<4;index++){
            if (faceValue[index+1]- faceValue[index]!=1){
                return false;
            }
        }
        return true;
    }
    public boolean fullHouse(Card[] hand){
        String[] faces=new String[5];
        for (int index=0;index<faces.length;index++){
            faces[index]=hand[index].getFace();
        }
        boolean hasThree=false;
        boolean hasTwo =false;
        for (String face: faces){
            int count=0;
            for (String f:faces){
                if (f.equals(face)){
                    count++;
                }
            }
            if (count==3){
                hasThree=true;
            }
            else if (count==2) {
                hasTwo =true;  }
        }
        return hasThree&& hasTwo;
    }
}
