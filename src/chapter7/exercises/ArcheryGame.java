package chapter7.exercises;

import java.security.SecureRandom;
import java.util.Arrays;

public  class ArcheryGame {

    public static void game(int[][] playersScore){
        SecureRandom random=new SecureRandom();
        for (int playerIndex=0;playerIndex<playersScore.length;playerIndex++){
            for (int scoreIndex=0;scoreIndex<playersScore[playerIndex].length;scoreIndex++){
                int score=random.nextInt(1,10);
                playersScore[playerIndex][scoreIndex]=score;
            }
        }

    }
    public static void printScores(int[][] playersScore){
        game(playersScore);
        System.out.println(Arrays.deepToString(playersScore));

        int winnerScore=0;
        int winner=0;
        System.out.println("PLAYER NUMBER\tFIRST CHANCE\tSECOND CHANCE\tTHIRD CHANCE\tTOTAL SCORE");
         for (int playerIndex=0;playerIndex<playersScore.length;playerIndex++){
             int total=0;
             System.out.printf("%5d",playerIndex+1);
             for (int scoreIndex=0;scoreIndex<playersScore[playerIndex].length;scoreIndex++){
                 System.out.printf("%17d",playersScore[playerIndex][scoreIndex]);


total+=playersScore[playerIndex][scoreIndex];
             }
             System.out.printf("%15d",total);
             if (winnerScore<total){
                 winnerScore=total;
                 winner=playerIndex+1;
             }
             System.out.println();
         }
        System.out.println();
         switch (winner) {
             case 1:
             System.out.printf("Player PELUMI with player number %d is the winner", winner);
                 break;
             case 2:
                 System.out.printf("Player MOYIN with player number %d is the winner", winner);
                 break;
             case 3:
                 System.out.printf("Player OFOLAHANMI with player number %d is the winner", winner);
                 break;
             case 4:
                 System.out.printf("Player SANDRA with player number %d is the winner", winner);

         }
    }

}
