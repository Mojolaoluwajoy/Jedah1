package chapter7.exercises.tortoiseAndTheHare;

import java.security.SecureRandom;
import java.util.Arrays;

public class TheTortoiseAndTheHare {
    static String[] [] track=new String[2][70];
     static String [] []runners;
public static boolean isWon=false;

    public static void printTrack(){
        for (int trackIndex=0;trackIndex<track.length;trackIndex++){
            System.out.println(Arrays.toString(track[trackIndex]));
        }
    }
    public static void initializeTrack(){
        for (int trackIndex=0;trackIndex<track.length;trackIndex++){
          for (int trackStepIndex=0;trackStepIndex<track[trackIndex].length;trackStepIndex++){
          track[trackIndex][trackStepIndex]=" ";
          }
        }
    }
    public static void load(){
        for (int count=0;count<3;count++){
            System.out.print(".");
           sleep();
        }
    }
    public static void sleep(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
public static void initiateRefereeCall(){
   load();
    print("On your track!");
    load();
    print("Get Ready");
    load();
    print("Go!!!");
}
public static void print(String message){
    System.out.println(message);
}

public static String[][] initializeRunners(String... runnersSymbol){
      runners=new String[runnersSymbol.length][2];
      for (int runnerIndex=0;runnerIndex<runners.length;runnerIndex++){
            runners[runnerIndex][0]=runnersSymbol[runnerIndex];
            runners[runnerIndex][1]="0";
        }
        return runners;
}
public static void assignNextIndexToRunners(SecureRandom random){
        for (int runnerIndex=0;runnerIndex<runners.length;runnerIndex++){
            int initialPosition=Integer.parseInt(runners[runnerIndex][1]);
            int newPosition=random.nextInt(1,10);
            int currentPosition=initialPosition+newPosition;
            if (currentPosition>69){
                currentPosition=69;
                isWon=true;
            }
runners[runnerIndex][1]=String.valueOf(currentPosition);
        }

        }
        public static void moveRunners(){
        for (int index1=0;index1<track.length;index1++){
            for (int index2=0;index2<track[index1].length;index2++){
            track[index1][index2] =" " ;
            }
        }
        assignNextIndexToRunners(new SecureRandom());
        for (int runnerIndex=0;runnerIndex<runners.length;runnerIndex++){
            int currentPosition=Integer.parseInt(runners[runnerIndex][1]);
            track[runnerIndex][currentPosition]=runners[runnerIndex][0];
        }
        if (isWon){
            print("Game won!");
        }
        }
}
