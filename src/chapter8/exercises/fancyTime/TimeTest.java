package chapter8.exercises.fancyTime;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int flag;
        introMessage();
try {


        getUserInput("kindly enter the value for hour");
   int hour=scanner.nextInt();
   getUserInput("kindly enter the value for minute");
   int minute=scanner.nextInt() ;
   getUserInput("kindly enter the value for second");
   int second=scanner.nextInt();
   System.out.println();
        Time time1=new Time(hour,minute,second,"pm/am");
        Time time2=new Time(hour,minute,second);
        Time time3=new Time(hour,minute);
        while (true){
            System.out.println("""
                    Kindly choose:
                    1 if you want the time displayed in 12 hours format,
                    2 if you want it in 24 hours format with seconds included
                    and 3 if you want it displayed in 24 hours format with seconds excluded:""");
            flag= scanner.nextInt();
            if (flag==1){
                displayTime(flag,time1);
                break;
            }else if (flag==2){
                displayTime(flag,time2);
                break;
            }
            else if (flag==3){
                displayTime(flag,time3);
                break;
            }else {
                System.err.println("The flag value entered is out of range!!!");
            }
        }
    }catch (IllegalArgumentException e){
    System.out.println("hour/seconds/minute is out of range");
}
    }
    public static void getUserInput(String message){
           System.out.println(message);
          }
    public static void displayTime(int flag,Time t){
        if (flag==1){
            System.out.println( t.toString()) ;
        }
        else {
            System.out.println(  t.toUniversalString());

        }
    }
    public static void introMessage(){
        System.out.println("""
                =========================
                  TIME DISPLAY SERVICES
                =========================
Welcome to time display services,a series of prompt
will be displayed on your screen shortly!
Kindly follow the prompts accordingly to get accurate result.""");
        System.out.println();
    }
}
