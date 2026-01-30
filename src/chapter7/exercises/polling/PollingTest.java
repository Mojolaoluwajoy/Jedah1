package chapter7.exercises.polling;

import java.util.Scanner;

public class PollingTest {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        String moreRatersOption;
         while (true){
                    Polling.storeRatings(scanner);
                    scanner.nextLine();
                    System.out.println("Enter yes to take the pole for the next person and any other word(s) to quit");
                  moreRatersOption = scanner.nextLine();
          if(moreRatersOption.equalsIgnoreCase("Quit")){
              break;
          }
     }
         Polling.skip();
       Polling.displayTable();
       }
    }

