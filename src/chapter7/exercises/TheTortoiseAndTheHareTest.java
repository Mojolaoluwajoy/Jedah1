package chapter7.exercises;

public class TheTortoiseAndTheHareTest {
public static void main(String[] args) {

     TheTortoiseAndTheHare.initializeTrack();
       TheTortoiseAndTheHare.initializeRunners("T","H");
      TheTortoiseAndTheHare.initiateRefereeCall();
       while (!TheTortoiseAndTheHare.isWon){
       TheTortoiseAndTheHare.moveRunners();
        TheTortoiseAndTheHare.printTrack();
       TheTortoiseAndTheHare.sleep();
      }
}}
